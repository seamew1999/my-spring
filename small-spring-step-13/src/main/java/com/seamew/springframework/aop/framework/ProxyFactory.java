package com.seamew.springframework.aop.framework;

import com.seamew.springframework.aop.AdvisedSupport;

/**
 * @Author: seamew
 * @Title: ProxyFactory
 * @CreateTime: 2022年11月29日 22:00:00
 * @Description:
 * @Version: 1.0
 */
public class ProxyFactory {
    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }
}
