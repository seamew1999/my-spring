package com.seamew.springframework.context;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.factory.Aware;

/**
 * @Author: seamew
 * @Title: ApplicationContextAware
 * @CreateTime: 2022年10月24日 11:26:00
 * @Description:
 * @Version: 1.0
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}