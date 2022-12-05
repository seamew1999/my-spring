package bean;

import com.seamew.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @Author: seamew
 * @Title: HusbandMother
 * @CreateTime: 2022年12月05日 14:28:00
 * @Description:
 * @Version: 1.0
 */
public class HusbandMother implements FactoryBean<IMother> {

    public HusbandMother() {
    }

    @Override
    public IMother getObject() throws Exception {
        return (IMother) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IMother.class}, (proxy, method, args) -> "婚后媳妇妈妈的职责被婆婆代理了！" + method.getName());
    }

    @Override
    public Class<?> getObjectType() {
        return IMother.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}

