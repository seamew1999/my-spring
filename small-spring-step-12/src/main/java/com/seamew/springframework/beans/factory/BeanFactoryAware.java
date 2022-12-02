package com.seamew.springframework.beans.factory;

import com.seamew.springframework.beans.BeansException;

/**
 * @Author: seamew
 * @Title: BeanFactoryAware
 * @CreateTime: 2022年10月24日 11:22:00
 * @Description:
 * @Version: 1.0
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
