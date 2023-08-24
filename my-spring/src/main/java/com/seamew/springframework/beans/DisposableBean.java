package com.seamew.springframework.beans;

/**
 * @Author: seamew
 * @Title: DisposableBean
 * @CreateTime: 2022年10月19日 10:14:00
 * @Description: 销毁 Bean 接口
 * @Version: 1.0
 */
public interface DisposableBean {

    /**
     * 销毁 Bean 调用
     *
     * @throws Exception
     */
    void destroy() throws Exception;

}
