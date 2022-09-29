package com.seamew.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: CGLibProxy
 * @CreateTime: 2022年09月29日 15:20:00
 * @Description:
 * @Version: 1.0
 */
public class CGLibProxy implements MethodInterceptor {
    // CGLib需要代理的目标对象
    private Object targetObject;

    public Object getProxyInstance(Object obj) {
        this.targetObject = obj;
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类--可以是类或者接口
        enhancer.setSuperclass(obj.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象，即代理对象
        Object proxyObj = enhancer.create();
        // 返回代理对象
        return proxyObj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        // 模拟功能增强
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        // 执行目标目标对象方法
        obj = method.invoke(targetObject, objects);
        // 模拟功能增强
        humanUtil.method2();
        return obj;
    }
}
