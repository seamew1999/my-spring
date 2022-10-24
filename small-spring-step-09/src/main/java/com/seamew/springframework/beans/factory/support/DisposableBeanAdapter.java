package com.seamew.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.DisposableBean;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: DisposableBeanAdapter
 * @CreateTime: 2022年10月19日 11:20:00
 * @Description: 采用适配器的方式同意封装接口，为了有一个统一的销毁方法
 * @Version: 1.0
 */
public class DisposableBeanAdapter implements DisposableBean {
    private final Object bean;
    private final String beanName;
    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, String destroyMethodName) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = destroyMethodName;
    }

    @Override
    public void destroy() throws Exception {
        // 1.实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        // 2.配置信息 destroy-method 判断是为了避免二次执行销毁
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = null;
            try {
                destroyMethod = bean.getClass().getMethod(destroyMethodName);
            } catch (NoSuchMethodException e) {
                throw new BeansException("Could not find an destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
