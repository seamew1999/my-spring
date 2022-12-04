package com.seamew.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @Author: seamew
 * @Title: Advisor
 * @CreateTime: 2022年11月29日 21:37:00
 * @Description: Advice 决定于 JoinPoint 执行什么操作。
 * @Version: 1.0
 */
public interface Advisor {


    /**
     * Return the advice part of this aspect. An advice may be an
     * interceptor, a before advice, a throws advice, etc.
     * @return the advice that should apply if the pointcut matches
     * @see org.aopalliance.intercept.MethodInterceptor
     * @see BeforeAdvice
     */
    Advice getAdvice();
}
