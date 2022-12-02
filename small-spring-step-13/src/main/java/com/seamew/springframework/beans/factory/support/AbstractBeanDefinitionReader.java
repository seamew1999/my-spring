package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.core.io.DefaultResourceLoader;
import com.seamew.springframework.core.io.ResourceLoader;

/**
 * @Author: seamew
 * @Title: AbstractBeanDefinitionReader
 * @CreateTime: 2022年10月12日 15:39:00
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{
    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
