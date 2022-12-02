package com.seamew.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import com.seamew.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: seamew
 * @Title: ClassPathScanningCandidateComponentProvider
 * @CreateTime: 2022年12月02日 15:02:00
 * @Description:
 * @Version: 1.0
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }

}
