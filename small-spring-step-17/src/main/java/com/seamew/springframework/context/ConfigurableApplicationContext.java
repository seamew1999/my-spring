package com.seamew.springframework.context;

import com.seamew.springframework.beans.BeansException;

/**
 * @Author: seamew
 * @Title: ConfigurableApplicationContext
 * @CreateTime: 2022年10月13日 17:18:00
 * @Description: 继承自 ApplicationContext 刷新容器的操作
 * @Version: 1.0
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
