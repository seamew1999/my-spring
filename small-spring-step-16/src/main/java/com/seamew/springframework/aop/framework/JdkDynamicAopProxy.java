package com.seamew.springframework.aop.framework;

import com.seamew.springframework.aop.AdvisedSupport;
import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: seamew
 * @Title: JdkDynamicAopProxy
 * @CreateTime: 2022年11月29日 15:28:00
 * @Description: jdk动态代理创建代理对象
 * @Version: 1.0
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler {

    private final AdvisedSupport advised;

    public JdkDynamicAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }

    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), advised.getTargetSource().getTargetClass(), this);
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 代理方法，该方法本质是代理类继承被代理类的接口生成的。
     * @param args 方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ReflectiveMethodInvocation methodInvocation = new ReflectiveMethodInvocation(advised.getTargetSource().getTarget(), method, args);
        if (advised.getMethodMatcher().matches(method, advised.getTargetSource().getTarget().getClass())) {
            MethodInterceptor methodInterceptor = advised.getMethodInterceptor();
            return methodInterceptor.invoke(methodInvocation);
        }
        return methodInvocation.proceed();
    }

}
