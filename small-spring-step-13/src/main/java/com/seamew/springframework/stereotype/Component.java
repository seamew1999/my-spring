package com.seamew.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @Author: seamew
 * @Title: Component
 * @CreateTime: 2022年12月02日 15:02:00
 * @Description:
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";

}
