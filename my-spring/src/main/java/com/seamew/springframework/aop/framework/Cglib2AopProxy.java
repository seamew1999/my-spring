package com.seamew.springframework.aop.framework;

import com.seamew.springframework.aop.AdvisedSupport;
import com.seamew.springframework.utils.ClassUtils;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: Cglib2AopProxy
 * @CreateTime: 2022年11月29日 15:35:00
 * @Description: Cglib创建代理对象
 * @Version: 1.0
 */
public class Cglib2AopProxy implements AopProxy {
    private final AdvisedSupport advised;

    public Cglib2AopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }

    @Override
    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ClassUtils.getActualClass(advised.getTargetSource().getTarget().getClass()));
        enhancer.setInterfaces(advised.getTargetSource().getTargetClass());
        enhancer.setCallback(new DynamicAdvisedInterceptor(advised));
        return enhancer.create();
    }

    private static class DynamicAdvisedInterceptor implements MethodInterceptor {
        private final AdvisedSupport advised;

        public DynamicAdvisedInterceptor(AdvisedSupport advised) {
            this.advised = advised;
        }

        /**
         * @param o           表示要进行增强的对象
         * @param method      表示拦截的方法
         * @param objects     数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
         * @param methodProxy 表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
         * @return 执行结果
         * @throws Throwable 异常
         *                   注意这里是调用invokeSuper而不是invoke，否则死循环;
         *                   methodProxy.invokeSuper执行的是原始类的方法;
         *                   method.invoke执行的是子类的方法;
         */

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            CglibMethodInvocation methodInvocation = new CglibMethodInvocation(advised.getTargetSource().getTarget(), method, objects, methodProxy);
            if (advised.getMethodMatcher().matches(method, advised.getTargetSource().getTarget().getClass())) {
                return advised.getMethodInterceptor().invoke(methodInvocation);
            }
            return methodInvocation.proceed();
        }
    }

    /**
     * 这里对 ReflectiveMethodInvocation 类进行了提升
     * 因为多出了 methodProxy 对象
     */
    private static class CglibMethodInvocation extends ReflectiveMethodInvocation {
        private final MethodProxy methodProxy;

        public CglibMethodInvocation(Object target, Method method, Object[] arguments, MethodProxy methodProxy) {
            super(target, method, arguments);
            this.methodProxy = methodProxy;
        }

        @Override
        public Object proceed() throws Throwable {
            return this.methodProxy.invoke(this.target, this.arguments);
        }

    }

}
