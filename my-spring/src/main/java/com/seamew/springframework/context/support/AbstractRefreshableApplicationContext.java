package com.seamew.springframework.context.support;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.seamew.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author: seamew
 * @Title: AbstractRefreshableApplicationContext
 * @CreateTime: 2022年10月14日 10:36:00
 * @Description: 获取Bean工厂和加载资源
 * @Version: 1.0
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
