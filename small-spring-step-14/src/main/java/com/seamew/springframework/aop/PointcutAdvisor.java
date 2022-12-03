package com.seamew.springframework.aop;

/**
 * @Author: seamew
 * @Title: PointcutAdvisor
 * @CreateTime: 2022年11月29日 21:39:00
 * @Description: PointcutAdvisor 承担了 Pointcut 和 Advice 的组合，Pointcut 用于获取 JoinPoint，而 Advice 决定于 JoinPoint 执行什么操作。
 * @Version: 1.0
 */
public interface PointcutAdvisor extends Advisor{

    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}
