package com.seamew.springframework.aop;

/**
 * @Author: seamew
 * @Title: ClassFilter
 * @CreateTime: 2022年11月29日 14:52:00
 * @Description:
 * @Version: 1.0
 */
public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
