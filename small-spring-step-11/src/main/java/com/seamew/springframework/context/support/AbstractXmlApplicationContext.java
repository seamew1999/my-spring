package com.seamew.springframework.context.support;

import com.seamew.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.seamew.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author: seamew
 * @Title: AbstractXmlApplicationContext
 * @CreateTime: 2022年10月14日 14:54:00
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
