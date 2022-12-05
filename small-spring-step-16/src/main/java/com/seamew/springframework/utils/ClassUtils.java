package com.seamew.springframework.utils;

/**
 * @Author: seamew
 * @Title: ClassUtils
 * @CreateTime: 2022年10月12日 15:25:00
 * @Description: 类的工具类
 * @Version: 1.0
 */
public class ClassUtils {
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

    /**
     * Check whether the specified class is a CGLIB-generated class.
     * @param clazz the class to check
     */
    public static boolean isCglibProxyClass(Class<?> clazz) {
        return (clazz != null && isCglibProxyClassName(clazz.getName()));
    }

    /**
     * Check whether the specified class name is a CGLIB-generated class.
     * @param className the class name to check
     */
    public static boolean isCglibProxyClassName(String className) {
        return (className != null && className.contains("$$"));
    }

    /**
     * 获取实际的class
     *
     * @param clazz the class
     */
    public static Class<?> getActualClass(Class<?> clazz) {
        return isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;
    }
}
