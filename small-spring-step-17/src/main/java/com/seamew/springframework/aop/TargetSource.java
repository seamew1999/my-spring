package com.seamew.springframework.aop;

import com.seamew.springframework.utils.ClassUtils;

/**
 * @Author: seamew
 * @Title: TargetSource
 * @CreateTime: 2022年11月29日 15:23:00
 * @Description: 是一个目标对象，在目标对象类中提供 Object 入参属性，以及获取目标类 TargetClass 信息。
 * @Version: 1.0
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    /**
     * 在 TargetSource#getTargetClass 是用于获取 target 对象的接口信息的，那么这
     * 个 target 可能是 JDK 代理 创建也可能是 CGlib 创建，为了保证都能正确的
     * 获取到结果，这里需要增加判读
     *
     * @return the type of targets returned by this {@link TargetSource}
     */
    public Class<?>[] getTargetClass() {
        Class<?> clazz = this.target.getClass();
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;
        return clazz.getInterfaces();
    }


    /**
     * Return a target instance. Invoked immediately before the
     * AOP framework calls the "target" of an AOP method invocation.
     *
     * @return the target object, which contains the joinpoint
     * @throws Exception if the target object can't be resolved
     */
    public Object getTarget() {
        return this.target;
    }


}
