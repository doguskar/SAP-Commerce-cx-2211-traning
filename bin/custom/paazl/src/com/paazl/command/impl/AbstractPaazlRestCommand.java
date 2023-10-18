package com.paazl.command.impl;

import com.paazl.model.PaazlConfigurationModel;
import com.paazl.service.PaazlService;
import com.paazl.command.request.AbstractPaazlRequest;
import com.rest.integration.util.command.rest.impl.AbstractRestCommand;
import com.rest.integration.util.exception.RestCommandException;
import de.hybris.platform.store.BaseStoreModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Objects;

public abstract class AbstractPaazlRestCommand<REQUEST extends AbstractPaazlRequest, RESPONSE> extends AbstractRestCommand<REQUEST, RESPONSE> {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractPaazlRestCommand.class);
    private BaseStoreModel baseStore;

    @Resource
    private PaazlService paazlService;

    @Override
    public void addAuthorization(HttpRequestBase baseRequest, REQUEST request) {
        if (StringUtils.isNotBlank(request.getApiKey())) {
            String token = request.getApiKey();
            if (StringUtils.isNotBlank(request.getApiSecret())) {
                token += ":" + request.getApiSecret();
            }
            baseRequest.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        }
    }

    @Override
    public String getBaseUrl() throws RestCommandException {
        final PaazlConfigurationModel paazlConfiguration = paazlService.getPaazlConfiguration(getBaseStore());
        if (Objects.nonNull(paazlConfiguration)) {
            final String baseUrl = paazlConfiguration.getBaseUrl();
            if (StringUtils.isNotBlank(baseUrl)) {
                return baseUrl;
            }
        }
        throw new RestCommandException("BaseUrl is not found for " + getResponseClass());
    }

    public BaseStoreModel getBaseStore() {
        return baseStore;
    }

    public void setBaseStore(BaseStoreModel baseStore) {
        this.baseStore = baseStore;
    }

    public PaazlService getPaazlService() {
        return paazlService;
    }

    public PaazlConfigurationModel getConfigurationModel() throws RestCommandException {
        if (Objects.nonNull(baseStore)) {
            PaazlConfigurationModel paazlConfiguration = paazlService.getPaazlConfiguration(baseStore);
            if (Objects.nonNull(paazlConfiguration)) {
                return paazlConfiguration;
            }
        }
        throw new RestCommandException("ConfigurationModel is not found for " + getResponseClass());
    }
}
