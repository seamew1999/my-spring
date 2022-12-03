package com.seamew.springframework.beans;

/**
 * @Author: seamew
 * @Title: BeansException
 * @CreateTime: 2022年09月28日 16:23:00
 * @Description: bean的异常
 * @Version: 1.0
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
