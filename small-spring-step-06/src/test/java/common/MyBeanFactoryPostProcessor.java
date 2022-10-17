package common;

import com.seamew.springframework.beans.BeansException;
import com.seamew.springframework.beans.PropertyValues;
import com.seamew.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.seamew.springframework.beans.factory.config.BeanDefinition;
import com.seamew.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.seamew.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author: seamew
 * @Title: MyBeanFactoryPostProcessor
 * @CreateTime: 2022年10月14日 15:15:00
 * @Description:
 * @Version: 1.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue("company", "改为: 字节跳动");
    }
}
