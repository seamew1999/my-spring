package com.seamew.springframework.context.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.config.BeanPostProcessor;
import com.seamew.springframework.context.ApplicationContext;
import com.seamew.springframework.context.ApplicationContextAware;

/**
 * @Author: seamew
 * @Title: ApplicationContextAwareProcessor
 * @CreateTime: 2022年10月24日 11:26:00
 * @Description:
 * @Version: 1.0
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
