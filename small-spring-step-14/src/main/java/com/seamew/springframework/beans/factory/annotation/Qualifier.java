package com.seamew.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @Author: seamew
 * @Title: Qualifier
 * @CreateTime: 2022年12月03日 15:51:00
 * @Description: Qualifier注解
 * @Version: 1.0
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";

}