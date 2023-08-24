package com.seamew.springframework.aop;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: MethodBeforeAdvice
 * @CreateTime: 2022年11月29日 21:34:00
 * @Description: 在 Spring 框架中，Advice 都是通过方法拦截器 MethodInterceptor 实现的
 * @Version: 1.0
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    /**
     * Callback before a given method is invoked.
     *
     * @param method method being invoked
     * @param args   arguments to the method
     * @param target target of the method invocation. May be <code>null</code>.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    void before(Method method, Object[] args, Object target) throws Throwable;
}
