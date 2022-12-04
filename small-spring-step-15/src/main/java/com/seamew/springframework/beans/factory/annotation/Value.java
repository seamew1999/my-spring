package com.seamew.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @Author: seamew
 * @Title: Value
 * @CreateTime: 2022年12月03日 15:51:00
 * @Description: value注解
 * @Version: 1.0
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    /**
     * The actual value expression: e.g. "#{systemProperties.myProp}".
     */
    String value();

}