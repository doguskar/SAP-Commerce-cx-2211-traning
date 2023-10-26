package com.channeladvisor.jobs;

import com.channeladvisor.model.ChannelAdvisorSendProductsJobModel;
//import com.channeladvisor.service.LtbChannelAdvisorProductsService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Collections;

public class ChannelAdvisorSendProductsJob extends AbstractJobPerformable<ChannelAdvisorSendProductsJobModel> {

    private static final Logger LOG = Logger.getLogger(ChannelAdvisorSendProductsJob.class);

    /*@Resource
    private LtbChannelAdvisorProductsService ltbChannelAdvisorProductsService;*/

    @Override
    public PerformResult perform(ChannelAdvisorSendProductsJobModel jobModel) {
        LOG.error("ChannelAdvisorSendProductsJob - Start - " + System.currentTimeMillis());
        jobModel.setProductLists(Collections.emptyList());
        jobModel.setBatchRequestIds(Collections.emptyList());
        modelService.save(jobModel);
        try {
            boolean result = false; //ltbChannelAdvisorProductsService.sendProducts(jobModel);
            if (result){
                LOG.error("ChannelAdvisorSendProductsJob - Finish - Success " + System.currentTimeMillis());
                return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
            }else {
                LOG.error("ChannelAdvisorSendProductsJob - Finish - Error" + System.currentTimeMillis());
                return new PerformResult(CronJobResult.ERROR, CronJobStatus.FINISHED);
            }
        }catch (Exception e){
            LOG.error("Exception while sending products to channel advisor", e);
            return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
        }
    }
}
