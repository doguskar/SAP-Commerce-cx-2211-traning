package com.channeladvisor.rest.requestlogs.command.impl;

import com.channeladvisor.model.IntegrationCronJobModel;
import com.rest.integration.util.command.requestlog.impl.AbstractSaveRequestLogCommand;
import com.rest.integration.util.model.RequestLogModel;

import java.util.ArrayList;
import java.util.List;

public class IntegrationJobRequestLogListCommand extends AbstractSaveRequestLogCommand<IntegrationCronJobModel> {

    @Override
    public void execute(RequestLogModel requestLog, IntegrationCronJobModel jobModel) {
        // save error log
        List<RequestLogModel> requestLogModels = new ArrayList<>(jobModel.getRequestLogList());
        requestLogModels.add(0, requestLog);
        jobModel.setRequestLogList(requestLogModels);
        getModelService().saveAll(requestLog, jobModel);
    }
}
