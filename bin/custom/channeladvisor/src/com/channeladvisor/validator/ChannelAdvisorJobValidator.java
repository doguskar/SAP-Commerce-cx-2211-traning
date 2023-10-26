package com.channeladvisor.validator;

import de.hybris.platform.cronjob.model.CronJobModel;

public interface ChannelAdvisorJobValidator {
    boolean validate(CronJobModel jobModel);
}
