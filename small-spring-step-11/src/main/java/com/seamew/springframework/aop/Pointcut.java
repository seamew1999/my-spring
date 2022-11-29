package com.seamew.springframework.aop;

/**
 * @Author: seamew
 * @Title: Pointcut
 * @CreateTime: 2022年11月29日 14:52:00
 * @Description: 切入点
 * @Version: 1.0
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
