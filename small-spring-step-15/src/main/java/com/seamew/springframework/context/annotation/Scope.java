package com.seamew.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @Author: seamew
 * @Title: Scope
 * @CreateTime: 2022年12月02日 15:01:00
 * @Description: scope注解
 * @Version: 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";

}