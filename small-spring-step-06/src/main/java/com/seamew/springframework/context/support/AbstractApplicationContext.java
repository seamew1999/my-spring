package com.seamew.springframework.context.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.seamew.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.seamew.springframework.beans.factory.config.BeanPostProcessor;
import com.seamew.springframework.context.ConfigurableApplicationContext;
import com.seamew.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @Author: seamew
 * @Title: AbstractApplicationContext
 * @CreateTime: 2022年10月13日 17:22:00
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {


    @Override
    public void refresh() throws BeansException {
        // 1.创建 BeanFactory，并加载 BeanDefinition
        refreshBeanFactory();
        // 2.获取 BeanFactory
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        // 3.在 Bean 实例化之前，执行 BeanFactoryPostProcessor
        invokeBeanFactoryPostProcessors(beanFactory);
        // 4.BeanPostProcessor 需要提前于其他Bean对象实例化之前执行注册操作
        registerBeanPostProcessors(beanFactory);
        // 5.提前实例化单例 Bean 对象
        beanFactory.preInstantiateSingletons();
    }

    protected abstract void refreshBeanFactory() throws BeansException;

    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }

    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return getBeanFactory().getBean(beanName, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }

}
