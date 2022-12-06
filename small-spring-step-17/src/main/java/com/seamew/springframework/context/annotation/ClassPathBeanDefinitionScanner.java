package com.seamew.springframework.context.annotation;

import cn.hutool.core.util.StrUtil;
import com.seamew.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import com.seamew.springframework.beans.factory.support.BeanDefinitionRegistry;
import com.seamew.springframework.stereotype.Component;

import java.util.Set;

/**
 * @Author: seamew
 * @Title: ClassPathBeanDefinitionScanner
 * @CreateTime: 2022年12月02日 15:05:00
 * @Description: component注解扫描
 * @Version: 1.0
 */
public class ClassPathBeanDefinitionScanner extends ClassPathScanningCandidateComponentProvider {
    private BeanDefinitionRegistry registry;

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        this.registry = registry;
    }

    public void doScan(String... basePackages) {
        for (String basePackage : basePackages) {
            Set<BeanDefinition> candidates = findCandidateComponents(basePackage);
            for (BeanDefinition beanDefinition  : candidates) {
                // 解析 Bean 的作用域 singleton、prototype
                String beanScope = resolveBeanScope(beanDefinition);
                if (StrUtil.isNotEmpty(beanScope)) {
                    beanDefinition.setScope(beanScope);
                }
                registry.registerBeanDefinition(determineBeanName(beanDefinition), beanDefinition);
            }
        }
        // 注册处理注解的 BeanPostProcessor（@Autowired、@Value）
        // 由于AutowiredAnnotationBeanPostProcessor并没有标注@Component,所以是无法在类扫描时注入到beanFactory中的,此处需要我们手动进行注册
        registry.registerBeanDefinition("com.seamew.springframework.context.annotation.internalAutowiredAnnotationProcessor", new BeanDefinition(AutowiredAnnotationBeanPostProcessor.class));
    }

    /**
     * 解析bean是否是单例
     *
     * @param beanDefinition bean定义
     * @return 解析结果
     */
    private String resolveBeanScope(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Scope scope = beanClass.getAnnotation(Scope.class);
        if (null != scope) return scope.value();
        return StrUtil.EMPTY;
    }

    /**
     * 确定bean名称
     *
     * @param beanDefinition bean定义
     * @return bean名称
     */
    private String determineBeanName(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Component component = beanClass.getAnnotation(Component.class);
        String value = component.value();
        if (StrUtil.isEmpty(value)) {
            value = StrUtil.lowerFirst(beanClass.getSimpleName());
        }
        return value;
    }
}
