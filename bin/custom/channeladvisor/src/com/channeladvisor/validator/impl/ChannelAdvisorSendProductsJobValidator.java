package com.channeladvisor.validator.impl;

import com.channeladvisor.model.ChannelAdvisorSendProductsJobModel;
import com.channeladvisor.validator.ChannelAdvisorJobValidator;
import de.hybris.platform.cronjob.model.CronJobModel;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChannelAdvisorSendProductsJobValidator implements ChannelAdvisorJobValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelAdvisorSendProductsJobValidator.class);

    @Override
    public boolean validate(CronJobModel jobModel) {
        boolean result = true;
        if (!(jobModel instanceof ChannelAdvisorSendProductsJobModel)){
            return false;
        }
        ChannelAdvisorSendProductsJobModel job = (ChannelAdvisorSendProductsJobModel) jobModel;
        if (CollectionUtils.isEmpty(job.getLanguages())) {
            LOGGER.error(" ****** Validation Error - No suitable language found for Channel Advisor Product Cronjob ****** ");
            result = false;
        }
        if (CollectionUtils.isEmpty(job.getChannelAdvisorCustomAttributeMappings())){
            LOGGER.error(" ****** Validation Error - No suitable Channel Advisor mappings found for Channel Advisor Product Cronjob ****** ");
            result = false;
        }
        /*if (job.getMarketPlace() == null){
            LOGGER.error(" ****** Validation Error - Select a marketplace ****** ");
            result = false;
        }else{
            if(job.getMarketPlace().getBaseStore() == null){
                LOGGER.error("**** Validation Error - Marketplace {} does not have a baseStore ***", job.getMarketPlace().getCode());
                result = false;
            }
        }*/
        return result && validateFtpParameters(job);
    }

    private boolean validateFtpParameters(ChannelAdvisorSendProductsJobModel job){
        boolean result = true;
        if (StringUtils.isBlank(job.getFtpUrl())){
            LOGGER.error("***** Validation Error - FTP url is empty *****");
            result = false;
        }
        if (StringUtils.isBlank(job.getFtpUserName())){
            LOGGER.error("***** Validation Error - FTP userName is empty *****");
            result = false;
        }
        if (StringUtils.isBlank(job.getFtpPassword())){
            LOGGER.error("***** Validation Error - FTP password is empty *****");
            result = false;
        }
        if (StringUtils.isBlank(job.getFtpDir())){
            LOGGER.error("***** Validation Error - FTP dir is empty *****");
            result = false;
        }
        return result;
    }
}
