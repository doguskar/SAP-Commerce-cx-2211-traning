package com.channeladvisor.jobs;

import com.channeladvisor.data.ProductData;
import com.channeladvisor.model.CAPartialStockUpdateJobModel;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.rest.command.response.GetProductsResponse;
import com.channeladvisor.service.ChannelAdvisorService;
import com.customcore.util.DateUtil;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.store.BaseStoreModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CAPartialStockUpdateJob extends AbstractJobPerformable<CAPartialStockUpdateJobModel> {
    private static final Logger LOG = LoggerFactory.getLogger(CAPartialStockUpdateJob.class);
    private static final long MAX_DIFF = 36000000; // 10 HOUR
    private static final int RESPONSE_LIMIT = 100;

    @Resource
    private ChannelAdvisorService channelAdvisorService;
    @Resource
    private ModelService modelService;

    @Override
    public PerformResult perform(CAPartialStockUpdateJobModel jobModel) {
        final BaseStoreModel baseStore = jobModel.getBaseStore();
        if (Objects.nonNull(baseStore)) {
            final ChannelAdvisorAccountModel account = jobModel.getChannelAdvisorAccount();
            if (Objects.nonNull(account)) {
                final Date now = new Date();
                final Date lastSuccessDate = getLastSuccessDate(jobModel, now);
                String nextLink = null;
                int skip = 0;
                try {
                    do {
                        final GetProductsResponse response = channelAdvisorService.getProductsForPartialStockUpdate(baseStore, account, lastSuccessDate, skip, jobModel);
                        if (Objects.nonNull(response)) {
                            final List<ProductData> productDataList = response.getValue();
                            channelAdvisorService.updateStockOfProducts(productDataList, baseStore);
                            nextLink = response.getNextLink();
                            skip += RESPONSE_LIMIT;
                        } else {
                            return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
                        }
                    } while (Objects.nonNull(nextLink));
                    jobModel.setLastSuccessDate(now);
                    modelService.save(jobModel);
                    return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
                } catch (Exception e) {
                    LOG.error("CAPartialStockUpdateJob failed. {}", e.getMessage(), e);
                }
            } else {
                LOG.error("ChannelAdvisorAccount is null the CAPartialStockUpdateJob({})", jobModel.getPk());
            }
        } else {
            LOG.error("BaseStore is null the CAPartialStockUpdateJob({})", jobModel.getPk());
        }
        return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
    }

    private Date getLastSuccessDate(CAPartialStockUpdateJobModel jobModel, Date now) {
        final Date lastSuccessDate = jobModel.getLastSuccessDate();
        if (Objects.nonNull(lastSuccessDate)) {
            long diff = now.getTime() - lastSuccessDate.getTime();
            if (diff < MAX_DIFF) {
                return lastSuccessDate;
            }
        }
        return DateUtil.addMinuteToDate(now, -15);
    }
}
