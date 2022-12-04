package com.seamew.springframework.utils;

/**
 * @Author: seamew
 * @Title: StringValueResolver
 * @CreateTime: 2022年12月03日 15:36:00
 * @Description: 字符串解析接口
 * @Version: 1.0
 */
public interface StringValueResolver {

    /**
     * 接口 StringValueResolver 是一个解析字符串操作的接口
     * @param strVal 带解析的字符串
     * @return 解析结果
     */
    String resolveStringValue(String strVal);

}
