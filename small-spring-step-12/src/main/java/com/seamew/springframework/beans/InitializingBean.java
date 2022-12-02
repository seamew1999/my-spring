package com.seamew.springframework.beans;

/**
 * @Author: seamew
 * @Title: InitializingBean
 * @CreateTime: 2022年10月19日 10:11:00
 * @Description: 初始化 Bean 接口
 * @Version: 1.0
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
