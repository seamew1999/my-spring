package com.seamew.springframework.aop;

import java.lang.reflect.Method;

/**
 * @Author: seamew
 * @Title: MethodMatcher
 * @CreateTime: 2022年11月29日 14:52:00
 * @Description:
 * @Version: 1.0
 */
public interface MethodMatcher {
    boolean matches(Method method, Class<?> targetClass);
}
