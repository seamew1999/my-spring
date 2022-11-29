package com.seamew.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: seamew
 * @Title: PropertyValues
 * @CreateTime: 2022年09月30日 10:20:00
 * @Description:
 * @Version: 1.0
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        for (int i = 0; i < propertyValueList.size(); i++) {
            if (propertyValueList.get(i).getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue);
                return;
            }
        }
        propertyValueList.add(propertyValue);
    }

    public void addPropertyValue(String name, Object value) {
        PropertyValue propertyValue = new PropertyValue(name, value);
        addPropertyValue(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[]{});
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }
}
