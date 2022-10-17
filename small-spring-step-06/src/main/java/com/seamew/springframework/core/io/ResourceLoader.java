package com.seamew.springframework.core.io;

/**
 * @Author: seamew
 * @Title: ResourceLoader
 * @CreateTime: 2022年10月12日 15:31:00
 * @Description:
 * @Version: 1.0
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
