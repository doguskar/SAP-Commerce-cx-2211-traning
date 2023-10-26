package com.channeladvisor.service.impl;/*
package com.channeladvisor.service.impl;

import com.channeladvisor.ftp.ChannelAdvisorFtpClient;
import com.channeladvisor.model.ChannelAdvisorSendProductsJobModel;
import com.channeladvisor.model.LtbChannelAdvisorFortiusFieldMapModel;
import com.channeladvisor.models.ProductCsvColumn;
import com.channeladvisor.models.ProductCsvRow;
import com.channeladvisor.service.LtbChannelAdvisorProductProviderService;
import com.channeladvisor.service.LtbChannelAdvisorProductsService;
import com.channeladvisor.validator.impl.ChannelAdvisorSendProductsJobValidator;
import com.ltb.core.dao.LtbArticleSpecificationDao;
import com.ltb.core.dao.impl.LtbProductDaoImpl;
import com.ltb.core.model.LtbSizeAndLengthVariantProductModel;
import com.ltb.core.util.LtbDateUtil;
import com.ltb.marketplace.constants.LtbmarketplaceConstants;
import com.ltb.marketplace.enums.MarketplaceLogStatus;
import com.ltb.marketplace.enums.MarketplaceProductStatus;
import com.ltb.marketplace.enums.MarketplaceTransferTpe;
import com.ltb.marketplace.model.MarketplaceMainDataLogsModel;
import com.ltb.marketplace.model.MarketplaceModel;
import com.ltb.marketplace.models.MarketplaceLogEntry;
import com.ltb.marketplace.service.LtbMarketplaceLogService;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.ProductDao;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class LtbChannelAdvisorProductsServiceImpl implements LtbChannelAdvisorProductsService {

    @Resource

    private CatalogVersionService catalogVersionService;

    @Resource
    private ProductDao productDao;

    @Resource
    private LtbChannelAdvisorProductProviderService productProviderService;

    @Resource
    private ModelService modelService;
    @Resource
    private CommonI18NService commonI18NService;

    @Resource
    private ChannelAdvisorProductCSVService channelAdvisorProductCSVService;

    @Resource
    private ChannelAdvisorFtpClient channelAdvisorFtpClient;

    @Resource
    private MediaService mediaService;

    @Resource
    private ChannelAdvisorSendProductsJobValidator cronjobValidator;

    private static final Logger LOGGER = LoggerFactory.getLogger(LtbChannelAdvisorProductsServiceImpl.class);
    private static final String CSV_MIME_TYPE = "text/csv";

    @Override
    public boolean sendProducts(ChannelAdvisorSendProductsJobModel jobModel) {
        if (!cronjobValidator.validate(jobModel)){
            LOGGER.error("Validation failed");
            return false;
        }

        List<ProductModel> products = getProducts(jobModel.getMarketPlace().getBaseStore().getUid());
        if (LOGGER.isInfoEnabled())
            LOGGER.info("Filtered products with size : {}", products.size());

        if (CollectionUtils.isEmpty(products)) {
            LOGGER.info(" ****** No suitable product found for Channel Advisor ****** ");
            modelService.save(jobModel);
            return false;
        }

        MarketplaceModel channelAdvisor = jobModel.getMarketPlace();
        List<MarketplaceLogEntry> logCreateRows = new ArrayList<>();
        defineCustomFieldMappings(jobModel);
        setArticleSpecifications();

        String formattedDate = LtbDateUtil.formatDate(new Date(), "yyyyMMddHHmmss");
        ArrayList<File> csvFiles = new ArrayList<>();
        final List<ProductCsvColumn> columns = createCsvColumns(jobModel);
        for (LanguageModel language : jobModel.getLanguages()) {
            Locale locale = commonI18NService.getLocaleForLanguage(language);
            StringBuilder csvString = createCsvString(products, channelAdvisor, logCreateRows, locale, columns);

            // generate files in the file system
            String fileName = "Masterdata-Hybris-ChannelAdvisor_" + language.getIsocode().toUpperCase() + "_" + formattedDate + ".csv";
            File csvFile = null;
            try {
                csvFile = channelAdvisorProductCSVService.writeCSVtoFile(csvString.toString(), fileName, jobModel);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (csvFile != null) {
                csvFiles.add(csvFile);
            } else {
                LOGGER.error("File generation error. lang: {}", language.getIsocode());
            }
            clearColumnValues(columns);
        }

        try {
            // send to ftp
            boolean allSent = sendFiles(csvFiles, jobModel);
            if (allSent){
                for (MarketplaceLogEntry logCreateRow : logCreateRows) {
                    logCreateRow.setMpProductstatus(MarketplaceProductStatus.SENT);
                }
                ltbMarketplaceLogService.addMarketplaceLog(logCreateRows);
            }
            return allSent;
        } catch (Exception e) {
            LOGGER.error("File sending error", e);
            return false;
        }
    }

    private void clearColumnValues(List<ProductCsvColumn> columns) {
        columns.stream().forEach(c -> c.clear());
    }

    private List<ProductCsvColumn> createCsvColumns(ChannelAdvisorSendProductsJobModel jobModel){
        final List<ProductCsvColumn> columns = new ArrayList<>();
        final Set<LtbChannelAdvisorFortiusFieldMapModel> attributeMappings = jobModel.getChannelAdvisorCustomAttributeMappings();
        attributeMappings.stream()
                .filter(attributeMapping -> StringUtils.isNotBlank(attributeMapping.getFortiusGuid())
                        || StringUtils.isNotBlank(attributeMapping.getPropertyName())
                        || StringUtils.isNotBlank(attributeMapping.getGalleryImages()))
                .forEach(attributeMapping -> {
                    columns.add(new ProductCsvColumn(attributeMapping));
                });
        return columns.stream().sorted(Comparator.comparing(ProductCsvColumn::getPriority)).collect(Collectors.toList());
    }

    private StringBuilder createCsvString(List<LtbSizeAndLengthVariantProductModel> products, MarketplaceModel channelAdvisor,
                                          List<MarketplaceLogEntry> logCreateRows, Locale locale, List<ProductCsvColumn> columns) {
        final StringBuilder builderRows = new StringBuilder();

        for (LtbSizeAndLengthVariantProductModel product : products) {
            productProviderService.fillProductCsvColumns(product, channelAdvisor, locale, columns);
            logCreateRows.add(mpSendProductsForLog(product, channelAdvisor, MarketplaceProductStatus.READY));
        }
        ltbMarketplaceLogService.addMarketplaceLog(logCreateRows);

        String header = channelAdvisorProductCSVService.getHeaders(columns);
        builderRows.append(header);
        channelAdvisorProductCSVService.convertToCsv(columns, builderRows);

        return builderRows;
    }

    private boolean sendFiles(List<File> files, ChannelAdvisorSendProductsJobModel jobModel) throws Exception {
        try {
            channelAdvisorFtpClient.uploadCsvToChannelAdvisorFTP(files, jobModel);
        }catch (Exception e){
            LOGGER.error("FTP error", e);
            addFailedFilesToJob(files, jobModel);
            return false;
        }
        // check error
        List<File> failedFiles = channelAdvisorFtpClient.getFailedFiles();
        if (CollectionUtils.isEmpty(failedFiles)){
            return true;
        }else {
            addFailedFilesToJob(failedFiles, jobModel);
            return false;
        }
    }

    private void defineCustomFieldMappings(final ChannelAdvisorSendProductsJobModel jobModel) {
        final HashMap<String, String> mappingMap = new HashMap<>();
        jobModel.getChannelAdvisorCustomAttributeMappings().stream().filter(LtbChannelAdvisorFortiusFieldMapModel::getSendToAdvisor)
                .forEach(entry -> mappingMap.put(entry.getFortiusGuid(), entry.getAdvisorName()));
        productProviderService.setCustomAttributeMappings(mappingMap);
    }

    private void setArticleSpecifications(){
        productProviderService.setArticleSpecificationModelList(ltbArticleSpecificationDao.getAllDistinctArticleSpecifications());
    }

    private List<LtbSizeAndLengthVariantProductModel> getProducts(String baseStoreUid) {
        CatalogVersionModel onlineProductCatalog = catalogVersionService.getCatalogVersion(LtbmarketplaceConstants.PRODUCT_CATALOG, LtbmarketplaceConstants.ONLINE_CATALOG_VERSION);
        List<LtbSizeAndLengthVariantProductModel> sizeProductList = ltbProductDao.getAllSizeVariantProductsByApprovedStatusAndWithPrice(onlineProductCatalog, baseStoreUid);
        return sizeProductList;
    }

    private void addFailedFilesToJob(List<File> files, ChannelAdvisorSendProductsJobModel jobModel){
        List<MediaModel> failedCsvs = files.stream().map(this::saveFailedCsv).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(failedCsvs)){
            failedCsvs.addAll(jobModel.getFailedCsv());
            jobModel.setFailedCsv(failedCsvs);
            modelService.save(jobModel);
        }
    }

    private MarketplaceLogEntry mpSendProductsForLog(LtbSizeAndLengthVariantProductModel product, MarketplaceModel channelAdvisor, MarketplaceProductStatus status) {
        MarketplaceLogEntry entry = new MarketplaceLogEntry();
        entry.setProductId(product.getCode());
        entry.setBarcode(product.getEan());
        entry.setMpProductstatus(status);
        entry.setTransferType(MarketplaceTransferTpe.MP_CREATE_PRODUCTS);
        entry.setStatus(MarketplaceLogStatus.SUCCESS);
        entry.setMarketplace(channelAdvisor);
        entry.setValidationResultCode(StringUtils.EMPTY);
        entry.setValidationResultName(StringUtils.EMPTY);
        entry.setTaskDetailsReason(StringUtils.EMPTY);
        entry.setTaskDetailsReasonUrl(StringUtils.EMPTY);
        return entry;
    }

    private MediaModel saveFailedCsv(File file) {
        String fileNameWithoutEnding = file.getName().split("\\.")[0];

        MediaModel media = modelService.create(MediaModel.class);
        media.setCode(fileNameWithoutEnding);
        media.setCatalogVersion(getContentCatalogVersion());
        media.setMime(CSV_MIME_TYPE);
        media.setRealFileName(file.getName());
        modelService.save(media);
        try {
            mediaService.setDataForMedia(media, convertToByteArrayOutputStream(file).toByteArray());
            deleteFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return media;
    }

    private ByteArrayOutputStream convertToByteArrayOutputStream(File file) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] array = FileUtils.readFileToString(file, StandardCharsets.UTF_8).getBytes();

        out.write(array);
        out.close();
        return out;
    }

    private CatalogVersionModel getContentCatalogVersion() {
        final String CATALOG_ID = "ltbContentCatalog";
        final String CATALOG_VERSION = "Online";
        return catalogVersionService.getCatalogVersion(CATALOG_ID, CATALOG_VERSION);
    }

    private void deleteFile(File file){
        try {
            Files.delete(Paths.get(file.getPath()));
        }catch (Exception e){
            LOGGER.error("Local CSV File delete error", e);
        }
    }
}
*/
