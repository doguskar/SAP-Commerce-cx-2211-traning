package com.channeladvisor.service.impl;

import com.channeladvisor.constants.ChanneladvisorConstants;
import com.channeladvisor.data.OrderData;
import com.channeladvisor.model.CAConfigurationModel;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.model.IntegrationCronJobModel;
import com.channeladvisor.rest.command.*;
import com.channeladvisor.rest.command.request.*;
import com.channeladvisor.rest.command.response.*;
import com.channeladvisor.service.ChannelAdvisorService;
import com.channeladvisor.service.IntegrationService;
import com.rest.integration.util.exception.NotSupportedException;
import com.rest.integration.util.exception.RestCommandException;
import com.rest.integration.util.factory.IFactory;
import com.rest.integration.util.factory.IFactoryRegistry;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.store.BaseStoreModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DefaultIntegrationService implements IntegrationService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultIntegrationService.class);

    @Resource
    private IFactoryRegistry iFactoryRegistry;
    @Resource
    private Converter<OrderModel, PatchOrderRequest> caUpdateOrderConverter;
    @Resource
    private ChannelAdvisorService channelAdvisorService;
    @Resource
    private Converter<OrderModel, OrderData> channelAdvisorOrderConverter;

    @Override
    public PostRefreshTokenResponse requestRefreshToken(final BaseStoreModel baseStore, final ChannelAdvisorAccountModel account) {
        final CAConfigurationModel caConfiguration = channelAdvisorService.getCAConfiguration(baseStore);
        if (Objects.nonNull(caConfiguration)) {
            final String refreshToken = account.getRefreshToken();
            if (StringUtils.isNotBlank(refreshToken)) {
                try {
                    IFactory<PostRefreshTokenCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                    PostRefreshTokenCommand command = commandIFactory.create(PostRefreshTokenCommand.class);
                    command.setBaseStore(baseStore);
                    final PostRefreshTokenRequest request = command.createRequest();
                    request.setRefreshToken(refreshToken);
                    request.setApplicationId(caConfiguration.getApplicationId());
                    request.setSharedSecret(caConfiguration.getSharedSecret());
                    return command.perform(request);
                } catch (RestCommandException | NotSupportedException e) {
                }
            } else {
                LOG.error("ChannelAdvisorAccount.refreshToken is blank for the account({})", account.getPk());
            }
        } else {
            LOG.error("CAConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    @Override
    public GetProductsResponse requestGetProducts(final BaseStoreModel baseStore, final ChannelAdvisorAccountModel account,
                                                  final String filter, final String select, final Integer skip, final IntegrationCronJobModel jobModel) {
        final String accessToken = channelAdvisorService.getAccessToken(baseStore, account);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                IFactory<GetProductsCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                GetProductsCommand command = commandIFactory.create(GetProductsCommand.class);
                command.setBaseStore(baseStore);
                final GetProductsRequest request = command.createRequest();
                request.setAccessToken(accessToken);
                request.setSelect(select);
                request.setFilter(filter);
                request.setSkip(skip);
                request.setSaveRequestLogCommandItem(jobModel);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the account({})", account.getPk());
        }
        return null;
    }

    @Override
    public PostProductExportResponse requestPostExportProduct(final BaseStoreModel baseStore, final ChannelAdvisorAccountModel account,
                                                              final String filter, final Integer profileId, final String select, final IntegrationCronJobModel jobModel) {
        final String accessToken = channelAdvisorService.getAccessToken(baseStore, account);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                IFactory<PostProductExportCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                PostProductExportCommand command = commandIFactory.create(PostProductExportCommand.class);
                command.setBaseStore(baseStore);
                final PostProductExportRequest request = command.createRequest();
                request.setAccessToken(accessToken);
                request.setProfileId(profileId);
                request.setFilter(filter);
                request.setTextBody(select);
                request.setSaveRequestLogCommandItem(jobModel);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the account({})", account.getPk());
        }
        return null;
    }

    @Override
    public GetProductExportResponse requestGetExportProduct(final BaseStoreModel baseStore, final ChannelAdvisorAccountModel account, final String token,
                                                            final IntegrationCronJobModel jobModel) {
        final String accessToken = channelAdvisorService.getAccessToken(baseStore, account);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                IFactory<GetProductExportCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                GetProductExportCommand command = commandIFactory.create(GetProductExportCommand.class);
                command.setBaseStore(baseStore);
                final GetProductExportRequest request = command.createRequest();
                request.setAccessToken(accessToken);
                request.setToken(token);
                request.setSaveRequestLogCommandItem(jobModel);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the account({})", account.getPk());
        }
        return null;
    }

    @Override
    public GetOrdersResponse requestGetOrders(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, Integer skip, String expand, IntegrationCronJobModel jobModel) {
        final String accessToken = channelAdvisorService.getAccessToken(baseStore, account);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                IFactory<GetOrdersCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                GetOrdersCommand command = commandIFactory.create(GetOrdersCommand.class);
                command.setBaseStore(baseStore);
                final GetOrdersRequest request = command.createRequest();
                request.setAccessToken(accessToken);
                request.setSelect(select);
                request.setFilter(filter);
                request.setExpand(expand);
                request.setSkip(skip);
                request.setSaveRequestLogCommandItem(jobModel);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the account({})", account.getPk());
        }
        return null;
    }

    @Override
    public PostCreateOrderResponse requestCreateOrder(OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final String accessToken = channelAdvisorService.getAccessToken(baseStore);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                final OrderData orderData = channelAdvisorOrderConverter.convert(order);
                IFactory<PostCreateOrderCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                PostCreateOrderCommand command = commandIFactory.create(PostCreateOrderCommand.class);
                command.setBaseStore(baseStore);
                PostCreateOrderRequest request = command.createRequest();
                request.setOrder(orderData);
                request.setAccessToken(accessToken);
                request.setSaveRequestLogCommandItem(order);
                final PostCreateOrderResponse response = command.perform(request);
                if (Objects.nonNull(response)) {
                    order.setCaOrderID(response.getId());
                }
                return response;
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the baseStore({})", baseStore.getUid());
        }
        return null;
    }

    @Override
    public PatchOrderResponse requestPatchOrder(OrderModel order, PatchOrderRequest request) {
        final BaseStoreModel baseStore = order.getStore();
        final String accessToken = channelAdvisorService.getAccessToken(baseStore);
        if (StringUtils.isNotBlank(accessToken)) {
            Integer orderId = channelAdvisorService.getCAOrderId(order);
            if (Objects.nonNull(orderId)) {
                try {
                    final OrderData orderData = channelAdvisorOrderConverter.convert(order);
                    IFactory<PatchOrderCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                    PatchOrderCommand command = commandIFactory.create(PatchOrderCommand.class);
                    command.setBaseStore(baseStore);
                    if (Objects.isNull(request)) {
                        request = caUpdateOrderConverter.convert(order);
                    }
                    final Map<String, String> pathVariables = new HashMap<>();
                    pathVariables.put(ChanneladvisorConstants.ORDER_ID, orderId.toString());
                    request.setPathVariables(pathVariables);
                    request.setAccessToken(accessToken);
                    request.setSaveRequestLogCommandItem(order);
                    return command.perform(request);
                } catch (RestCommandException | NotSupportedException e) {
                }
            } else {
                LOG.error("CHANNEL-ADVISOR orderId is null for the order({})", order.getPk());
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the baseStore({})", baseStore.getUid());
        }
        return null;
    }

    @Override
    public PatchOrderResponse requestPatchOrder(OrderModel order) {
        return requestPatchOrder(order, null);
    }

    @Override
    public PostCreateFullOrderCancelResponse requestPostFullOrderCancel(OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final String accessToken = channelAdvisorService.getAccessToken(baseStore);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                final OrderData orderData = channelAdvisorOrderConverter.convert(order);
                IFactory<PostCreateFullOrderCancelCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                PostCreateFullOrderCancelCommand command = commandIFactory.create(PostCreateFullOrderCancelCommand.class);
                command.setBaseStore(baseStore);
                PostCreateFullOrderCancelRequest request = command.createRequest();
                final Map<String, String> pathVariables = new HashMap<>();
                pathVariables.put(ChanneladvisorConstants.ORDER_ID, order.getCaOrderID().toString());
                request.setPathVariables(pathVariables);
                request.setAccessToken(accessToken);
                request.setSaveRequestLogCommandItem(order);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        }
        return null;
    }

    @Override
    public GetOrderItemsResponse requestGetOrderItems(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, String expand, Integer skip, IntegrationCronJobModel jobModel) {
        final String accessToken = channelAdvisorService.getAccessToken(baseStore, account);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                IFactory<GetOrderItemsCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                GetOrderItemsCommand command = commandIFactory.create(GetOrderItemsCommand.class);
                command.setBaseStore(baseStore);
                final GetOrderItemsRequest request = command.createRequest();
                request.setAccessToken(accessToken);
                request.setSelect(select);
                request.setFilter(filter);
                request.setExpand(expand);
                request.setSkip(skip);
                request.setSaveRequestLogCommandItem(jobModel);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("CHANNEL-ADVISOR accessToken is null for the account({})", account.getPk());
        }
        return null;
    }

    @Override
    public PutOrderItemAdjustmentsResponse requestUpdateOrderItemAdjustments(String orderItemAdjustmentId, String entryId, OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final String accessToken = channelAdvisorService.getAccessToken(baseStore);
        if (StringUtils.isNotBlank(accessToken)) {
            try {
                IFactory<PutOrderItemAdjustmentsCommand> commandIFactory = iFactoryRegistry.getFactory(ChanneladvisorConstants.CA_REST_COMMAND_FACTORY_KEY);
                PutOrderItemAdjustmentsCommand command = commandIFactory.create(PutOrderItemAdjustmentsCommand.class);
                command.setBaseStore(baseStore);
                PutOrderItemAdjustmentsRequest request = command.createRequest();
                request.setAccessToken(accessToken);
                final Map<String, String> pathVariables = new HashMap<>();
                pathVariables.put(ChanneladvisorConstants.ID, orderItemAdjustmentId);
                request.setPublicNotes(order.getCode() + "_" + entryId);
                request.setPathVariables(pathVariables);
                request.setSaveRequestLogCommandItem(order);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        }
        return null;
    }
}
