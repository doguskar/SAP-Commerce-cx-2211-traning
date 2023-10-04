package com.rest.integration.util.service.impl;

import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.command.requestlog.impl.DefaultSaveRequestLogCommand;
import com.rest.integration.util.command.rest.IRestCommand;
import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import com.rest.integration.util.constants.RestintegrationutilConstants;
import com.rest.integration.util.exception.RestCommandException;
import com.rest.integration.util.exception.NotSupportedException;
import com.rest.integration.util.factory.IFactory;
import com.rest.integration.util.factory.IFactoryRegistry;
import com.rest.integration.util.service.IntegrationService;
import de.hybris.platform.core.model.ItemModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class DefaultIntegrationService implements IntegrationService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultIntegrationService.class);

    @Resource
    private IFactoryRegistry iFactoryRegistry;

    @Override
    public IResponse request(IRequest request, Class<? extends IRestCommand> commandClass,
                             Class<? extends ISaveRequestLogCommand> saveRequestLogCommandClass, ItemModel itemModel) {
        IResponse response = null;
        ISaveRequestLogCommand saveRequestLogCommand = null;
        try {
            IFactory<IRestCommand> restCommandFactory = iFactoryRegistry.getFactory(RestintegrationutilConstants.REST_COMMAND_FACTORY_KEY);
            IFactory<ISaveRequestLogCommand> saveRequestLogCommandFactory = iFactoryRegistry.getFactory(RestintegrationutilConstants.SAVE_REQUEST_LOG_COMMAND_FACTORY_KEY);
            IRestCommand command = restCommandFactory.create(commandClass);
            saveRequestLogCommand = saveRequestLogCommandFactory.create(saveRequestLogCommandClass);
            response = command.perform(request);
            return response;
        } catch (NotSupportedException | RestCommandException e) {
            // log printed
        } finally {
            saveRequestLogCommand.execute(request, response, itemModel);
        }
        return null;
    }

    @Override
    public IResponse request(IRequest request, Class commandClass) {
        return request(request, commandClass, DefaultSaveRequestLogCommand.class, null);
    }
}
