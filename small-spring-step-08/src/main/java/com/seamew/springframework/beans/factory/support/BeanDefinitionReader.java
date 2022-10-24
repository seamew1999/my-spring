package com.seamew.springframework.beans.factory.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.core.io.Resource;
import com.seamew.springframework.core.io.ResourceLoader;

/**
 * @Author: seamew
 * @Title: BeanDefinitionReader
 * @CreateTime: 2022年10月12日 15:35:00
 * @Description:
 * @Version: 1.0
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String[] locations) throws BeansException;
}
