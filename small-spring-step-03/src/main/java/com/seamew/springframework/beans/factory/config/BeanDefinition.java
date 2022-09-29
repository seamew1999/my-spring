package com.seamew.springframework.beans.factory.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: seamew
 * @Title: BeanDefinition
 * @CreateTime: 2022年09月28日 16:16:00
 * @Description:
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeanDefinition {
    private Class beanClass;
}
