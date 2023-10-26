package com.channeladvisor.jobs;

import com.channeladvisor.constants.ChanneladvisorConstants;
import com.channeladvisor.model.CAFullStockUpdateJobModel;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.models.FullStockUpdateProduct;
import com.channeladvisor.rest.command.response.GetProductExportResponse;
import com.channeladvisor.rest.command.response.PostProductExportResponse;
import com.channeladvisor.service.ChannelAdvisorService;
import com.channeladvisor.service.IntegrationService;
import com.customcore.util.DateUtil;
import com.opencsv.bean.CsvToBeanBuilder;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.TriggerModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.util.StandardDateRange;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Cronjob flow chart: https://drive.google.com/file/d/1czAKvPx1w7L-kesX30K7dFWn6tFRQKHm/view?usp=sharing
 * created by Doğuş Kar
 */

public class CAFullStockUpdateJob extends AbstractJobPerformable<CAFullStockUpdateJobModel> {
    private static final Logger LOG = LoggerFactory.getLogger(CAFullStockUpdateJob.class);
    private static final String PRODUCT_EXPORT_CSV_HEADER = "ID,SKU,EAN,TotalAvailableQuantity";
    private static final int ONE = 1;
    private static final int FIVE = 5;
    private static final String MEDIA_PATH = "media.read.dir";
    private static final String CHANNEL_ADVISOR_DOWNLOAD_PATH = "/sys_master/channel-advisor-products/";
    private static final String ZIP_FILE_EXTENSION = ".zip";
    private static final String TXT_FILE_EXTENSION = ".txt";

    @Resource
    private ChannelAdvisorService channelAdvisorService;
    @Resource
    private ModelService modelService;
    @Resource
    private ConfigurationService configurationService;
    @Resource
    private MediaService mediaService;
    @Resource
    private IntegrationService integrationService;

    @Override
    public PerformResult perform(CAFullStockUpdateJobModel jobModel) {
        final BaseStoreModel baseStore = jobModel.getBaseStore();
        if (Objects.nonNull(baseStore)) {
            final ChannelAdvisorAccountModel account = jobModel.getChannelAdvisorAccount();
            if (Objects.nonNull(account)) {
                final Set<String> inProgressTokens = new HashSet<>(jobModel.getInProgressTokens());
                final Set<Integer> remainingProfileIds;
                if (CollectionUtils.isNotEmpty(inProgressTokens)) {
                    remainingProfileIds = new HashSet<>(jobModel.getInProgressProfileIds());
                } else {
                    remainingProfileIds = new HashSet<>(jobModel.getProfileIds());
                    jobModel.setProcessStartedDate(new Date());
                }
                try {
                    if (CollectionUtils.isNotEmpty(remainingProfileIds)) {
                        final Date lastSuccessDate = jobModel.getLastSuccessDate();
                        if (postProductExport(baseStore, account, remainingProfileIds, lastSuccessDate, jobModel)) {
                            if (CollectionUtils.isEmpty(remainingProfileIds)) {
                                scheduleJob(jobModel, FIVE);
                            } else {
                                scheduleJob(jobModel, ONE);
                            }
                            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
                        } else {
                            LOG.error("postProductExport failed for the CAFullStockUpdateJob({})", jobModel.getPk());
                        }
                    } else {
                        // inProgressTokens is not empty, inProgressProfileIds is empty, start update stock
                        if (getProductsExports(baseStore, account, inProgressTokens, jobModel)) {
                            if (CollectionUtils.isNotEmpty(inProgressTokens)) {
                                scheduleJob(jobModel, FIVE);
                            } else {
                                jobModel.setLastSuccessDate(jobModel.getProcessStartedDate());
                                disableTrigger(jobModel);
                            }
                            modelService.save(jobModel);
                            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
                        } else {
                            modelService.save(jobModel);
                        }
                    }
                } catch (Exception e) {
                    LOG.error("CAFullStockUpdateJob failed. {}", e.getMessage(), e);
                }
            } else {
                LOG.error("ChannelAdvisorAccount is null the CAFullStockUpdateJob({})", jobModel.getPk());
            }
        } else {
            LOG.error("BaseStore is null the CAFullStockUpdateJob({})", jobModel.getPk());
        }
        return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
    }

    private boolean postProductExport(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, Set<Integer> profileIds,
                                      Date lastSuccessDate, CAFullStockUpdateJobModel jobModel) {
        final Set<String> inProgressTokens = new HashSet<>(jobModel.getInProgressTokens());
        boolean result = true;
        final String filter = Objects.nonNull(lastSuccessDate) ?
                "UpdateDateUtc ge " + DateUtil.formatDate(lastSuccessDate, DateUtil.CA_DATE_FORMAT) : null;
        final Iterator<Integer> profileIdIter = profileIds.iterator();
        Integer idx = 0;
        while (profileIdIter.hasNext()) {
            Integer profileId = profileIdIter.next();
            final PostProductExportResponse response = integrationService.requestPostExportProduct(baseStore, account, filter, profileId, PRODUCT_EXPORT_CSV_HEADER, jobModel);
            if (Objects.nonNull(response) && Objects.nonNull(response.getToken())) {
                inProgressTokens.add(response.getToken());
                profileIds.remove(profileId);
            } else {
                result = false;
                break;
            }
            //Accounts are limited to a maximum of 10 requests per minute. Additional export requests will be rejected with HTTP status 429 Too Many Requests.
            if (++idx % 9 == 0) {
                break;
            }
        }
        jobModel.setInProgressProfileIds(profileIds);
        jobModel.setInProgressTokens(inProgressTokens);
        modelService.save(jobModel);
        return result;
    }

    private boolean getProductsExports(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, Set<String> inProgressTokens, CAFullStockUpdateJobModel jobModel) {
        AtomicBoolean result = new AtomicBoolean(true);
        Set<String> remainInProgressTokens = new HashSet<>(inProgressTokens);
        remainInProgressTokens.stream().forEach(inProgressToken -> {
            final File zipFile = getZipFile(inProgressToken);
            try {
                if (!zipFile.exists()) {
                    final String responseStatus = downloadZipFile(baseStore, account, inProgressToken, zipFile, jobModel);
                    if (!ChanneladvisorConstants.STATUS_COMPLETE.equals(responseStatus)) {
                        result.set(false);
                        if (!ChanneladvisorConstants.STATUS_IN_PROGRESS.equals(responseStatus)) {
                            // reset job
                            inProgressTokens.clear();
                            scheduleJob(jobModel, ONE);
                        }
                    }
                }
                if (zipFile.exists()) {
                    File txtFile = getTxtFileFromZip(zipFile);
                    if (txtFile.exists()) {
                        List<FullStockUpdateProduct> productDataList = readProductData(txtFile);
                        if (CollectionUtils.isNotEmpty(productDataList)) {
                            channelAdvisorService.updateStockOfProducts(productDataList, baseStore, true);
                        }
                        inProgressTokens.remove(inProgressToken);
                        saveFile(txtFile, jobModel);
                        zipFile.delete();
                        txtFile.delete();
                    }
                } else {
                    // the file in progress continue
                }
            } catch (IOException e) {
                result.set(false);
                LOG.error("getProductsExports failed. IOException: {}", e.getMessage(), e);
            }
        });
        jobModel.setInProgressTokens(inProgressTokens);
        return result.get();
    }

    private String downloadZipFile(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String inProgressToken, File zipFile, CAFullStockUpdateJobModel jobModel) throws IOException {
        final GetProductExportResponse response = integrationService.requestGetExportProduct(baseStore, account, inProgressToken, jobModel);
        if (Objects.nonNull(response)) {
            if (StringUtils.isNotBlank(response.getResponseFileUrl())) {
                FileUtils.copyURLToFile(new URL(response.getResponseFileUrl()), zipFile);
            }
            return response.getStatus();
        } else {
            LOG.error("getProductsExports failed for the CAFullStockUpdateJob, token: ", inProgressToken);
        }
        return null;
    }

    private List<FullStockUpdateProduct> readProductData(File txtFile) throws FileNotFoundException {
        return new CsvToBeanBuilder(new FileReader(txtFile))
                .withType(FullStockUpdateProduct.class)
                .withSeparator('\t')
                .build()
                .parse();
    }


    private File getZipFile(String token) {
        final String MEDIA_DIR = configurationService.getConfiguration().getString(MEDIA_PATH) + CHANNEL_ADVISOR_DOWNLOAD_PATH;
        final File directory = new File(MEDIA_DIR);
        if (!directory.exists()) {
            directory.mkdir();
        }
        final String FILENAME = token + ZIP_FILE_EXTENSION;
        final File zipFile = new File(MEDIA_DIR + FILENAME);
        return zipFile;
    }

    private File getTxtFileFromZip(File zipFile) throws IOException {
        final File directory = zipFile.getParentFile();
        final String txtFileName = zipFile.getName().replace(ZIP_FILE_EXTENSION, TXT_FILE_EXTENSION);
        File txtFile = new File(directory, txtFileName);
        if (!txtFile.exists()) {
            byte[] buffer = new byte[1024];
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            if (Objects.nonNull(zipEntry)) {
                FileOutputStream fos = new FileOutputStream(txtFile);
                int len;
                while ((len = zipInputStream.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
            }
            zipInputStream.closeEntry();
            zipInputStream.close();
        }
        return txtFile;
    }

    private void scheduleJob(CAFullStockUpdateJobModel jobModel, Integer minutes) {
        final TriggerModel continueTrigger = jobModel.getContinueTrigger();
        final TriggerModel trigger = Objects.nonNull(continueTrigger) ? continueTrigger : modelService.create(TriggerModel.class);
        final Date now = new Date();
        final Date activationTime = DateUtil.addMinuteToDate(now, minutes);
        final StandardDateRange dateRange = new StandardDateRange(now, DateUtil.addMinuteToDate(activationTime, ONE));
        if (Objects.isNull(trigger.getCronJob())) {
            trigger.setCronJob(jobModel);
        }
        trigger.setDateRange(dateRange);
        trigger.setActivationTime(activationTime);
        trigger.setActive(Boolean.TRUE);
        jobModel.setContinueTrigger(trigger);
        List<TriggerModel> triggers = new ArrayList<>(jobModel.getTriggers());
        if (!triggers.contains(trigger)) {
            triggers.add(trigger);
        }
        modelService.saveAll(trigger, jobModel);
    }

    private void disableTrigger(CAFullStockUpdateJobModel jobModel) {
        final TriggerModel continueTrigger = jobModel.getContinueTrigger();
        if (Objects.nonNull(continueTrigger)) {
            continueTrigger.setActive(Boolean.FALSE);
            modelService.saveAll(continueTrigger);
        }
    }

    public File saveFile(File file, CAFullStockUpdateJobModel jobModel) throws FileNotFoundException {
        MediaModel mediaModel = modelService.create(MediaModel.class);
        mediaModel.setCode(file.getName());
        mediaModel.setMime("application/csv");
        mediaModel.setRealFileName(file.getName());
        List<MediaModel> createdFiles = new ArrayList<>(jobModel.getLastExportedProductFiles());
        createdFiles.add(0, mediaModel);
        jobModel.setLastExportedProductFiles(createdFiles);
        modelService.saveAll(mediaModel, jobModel);
        mediaService.setStreamForMedia(mediaModel, new FileInputStream(file));
        return file;
    }
}
