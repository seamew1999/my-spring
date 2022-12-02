package com.seamew.springframework.aop.framework;

/**
 * @Author: seamew
 * @Title: AopProxy
 * @CreateTime: 2022年11月29日 15:28:00
 * @Description: 定义一个标准接口，用于获取代理类。因为具体实现代理的方式可以有 JDK 方式，也可以是 Cglib 方式，所以定义接口会更加方便管理实现类。
 * @Version: 1.0
 */
public interface AopProxy {
    Object getProxy();
}
