package com.seamew.springframework.beans;

import com.sun.istack.internal.Nullable;

/**
 * @Author: seamew
 * @Title: PropertyValue
 * @CreateTime: 2022年09月30日 10:14:00
 * @Description: BeanDefinition 的 属性值
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

    @Override
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        } else if (!(other instanceof PropertyValue)) {
            return false;
        } else {
            PropertyValue otherPv = (PropertyValue)other;
            return this.name.equals(otherPv.name);
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * 29;
    }
}
