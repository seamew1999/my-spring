package com.seamew.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: seamew
 * @Title: Resource
 * @CreateTime: 2022年10月12日 15:14:00
 * @Description: 处理资源加载流。
 * @Version: 1.0
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
