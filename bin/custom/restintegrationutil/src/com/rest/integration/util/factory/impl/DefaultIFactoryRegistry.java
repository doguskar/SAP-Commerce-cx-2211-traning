package com.rest.integration.util.factory.impl;

import com.rest.integration.util.factory.IFactory;
import com.rest.integration.util.factory.IFactoryRegistry;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import com.rest.integration.util.exception.NotSupportedException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DefaultIFactoryRegistry implements IFactoryRegistry, ApplicationContextAware, InitializingBean {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultIFactoryRegistry.class);
    private ApplicationContext applicationContext;
    private Collection<IFactory> iFactoryList;

    public IFactory getFactory(String key) throws NotSupportedException {
        if (StringUtils.isNotBlank(key)) {
            Optional<IFactory> defaultFactory = this.iFactoryList.stream().filter(factory -> key.equals(factory.getKey())).findFirst();
            if (defaultFactory.isPresent()) {
                return defaultFactory.get();
            }
        }
        throw new NotSupportedException("Factory not found for " + key);
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void afterPropertiesSet() {
        this.iFactoryList = this.applicationContext.getBeansOfType(IFactory.class).values();
        if (this.iFactoryList == null || this.iFactoryList.isEmpty()) {
            LOG.warn("Missing factory! At least one factory bean should be bound to the current spring application context");
            this.iFactoryList = Collections.emptyList();
        }
    }

    public void setCommandFactoryList(Collection<IFactory> iFactoryList) {
        this.iFactoryList = iFactoryList;
    }
}