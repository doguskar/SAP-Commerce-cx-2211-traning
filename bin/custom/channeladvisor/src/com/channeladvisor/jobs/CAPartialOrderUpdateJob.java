package com.channeladvisor.jobs;

import com.channeladvisor.data.OrderData;
import com.channeladvisor.model.CAPartialOrderUpdateJobModel;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.rest.command.response.GetOrdersResponse;
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

public class CAPartialOrderUpdateJob extends AbstractJobPerformable<CAPartialOrderUpdateJobModel> {
    private static final Logger LOG = LoggerFactory.getLogger(CAPartialOrderUpdateJob.class);
    private static final int RESPONSE_LIMIT = 100;

    @Resource
    private ChannelAdvisorService channelAdvisorService;
    @Resource
    private ModelService modelService;

    @Override
    public PerformResult perform(CAPartialOrderUpdateJobModel jobModel) {
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
                        final GetOrdersResponse response = channelAdvisorService.getOrdersForPartialUpdate(baseStore, account, lastSuccessDate, skip, jobModel, jobModel.getSites());
                        if (Objects.nonNull(response)) {
                            final List<OrderData> orderDataList = response.getValue();
                            channelAdvisorService.updateOrdersFromCA(orderDataList);
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
                    LOG.error("CAPartialOrderUpdateJob failed. {}", e.getMessage(), e);
                }
            } else {
                LOG.error("ChannelAdvisorAccount is null the CAPartialStockUpdateJob({})", jobModel.getPk());
            }
        } else {
            LOG.error("BaseStore is null the CAPartialStockUpdateJob({})", jobModel.getPk());
        }
        return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
    }

    private Date getLastSuccessDate(CAPartialOrderUpdateJobModel jobModel, Date now) {
        final Date lastSuccessDate = jobModel.getLastSuccessDate();
        return Objects.nonNull(lastSuccessDate)? lastSuccessDate : DateUtil.addMinuteToDate(now, -15);
    }
}
