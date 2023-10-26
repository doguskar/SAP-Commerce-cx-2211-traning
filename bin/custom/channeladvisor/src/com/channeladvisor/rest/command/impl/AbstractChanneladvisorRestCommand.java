package com.channeladvisor.rest.command.impl;

import com.channeladvisor.model.CAConfigurationModel;
import com.channeladvisor.rest.command.request.ChannelAdvisorIRequest;
import com.channeladvisor.service.ChannelAdvisorService;
import com.rest.integration.util.command.rest.impl.AbstractRestCommand;
import com.rest.integration.util.exception.RestCommandException;
import de.hybris.platform.store.BaseStoreModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpRequestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.Objects;

public abstract class AbstractChanneladvisorRestCommand<REQUEST extends ChannelAdvisorIRequest, RESPONSE> extends AbstractRestCommand<REQUEST, RESPONSE> {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractChanneladvisorRestCommand.class);
    private BaseStoreModel baseStore;
    @Resource
    private ChannelAdvisorService channelAdvisorService;

    @Override
    public void addAuthorization(HttpRequestBase baseRequest, REQUEST request) {
        if (StringUtils.isNotBlank(request.getAccessToken())) {
            baseRequest.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + request.getAccessToken());
        } else if (StringUtils.isNotBlank(request.getApplicationId()) && StringUtils.isNotBlank(request.getSharedSecret())) {
            final String token = request.getApplicationId() + ":" + request.getSharedSecret();
            baseRequest.addHeader(HttpHeaders.AUTHORIZATION, "Basic " + Base64.getEncoder().encodeToString(token.getBytes()));
        }
    }

    @Override
    public String getBaseUrl() throws RestCommandException {
        final String baseUrl = getConfigurationModel().getBaseUrl();
        if (StringUtils.isNotBlank(baseUrl)) {
            return baseUrl;
        }
        throw new RestCommandException("BaseUrl is not found for " + getResponseClass());
    }

    public BaseStoreModel getBaseStore() {
        return baseStore;
    }

    public void setBaseStore(BaseStoreModel baseStore) {
        this.baseStore = baseStore;
    }

    public CAConfigurationModel getConfigurationModel() throws RestCommandException {
        if (Objects.nonNull(baseStore)) {
            CAConfigurationModel configuration = channelAdvisorService.getCAConfiguration(baseStore);
            if (Objects.nonNull(configuration)) {
                return configuration;
            }
        }
        throw new RestCommandException("ConfigurationModel is not found for " + getResponseClass());
    }
}
