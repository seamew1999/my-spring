package com.seamew.springframework.beans;

/**
 * @Author: seamew
 * @Title: PropertyValue
 * @CreateTime: 2022年09月30日 10:14:00
 * @Description:
 * @Version: 1.0
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }


}
