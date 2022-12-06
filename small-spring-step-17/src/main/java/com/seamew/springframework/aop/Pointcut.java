package com.seamew.springframework.aop;

/**
 * @Author: seamew
 * @Title: Pointcut
 * @CreateTime: 2022年11月29日 14:52:00
 * @Description: Pointcut 用于获取 JoinPoint
 * @Version: 1.0
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
