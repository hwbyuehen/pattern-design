package com.yuehen.pattern.structure.proxy.domain;

import com.yuehen.pattern.structure.proxy.YHClassLoader;
import com.yuehen.pattern.structure.proxy.YHInvocationHandler;
import com.yuehen.pattern.structure.proxy.YHProxy;

import java.lang.reflect.Method;

/**
 * 中介
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class Medium implements YHInvocationHandler {
    private Object target;
    public Object getInstance(Object obj) throws Exception{
        this.target = obj;
        Class<?> clazz = target.getClass();
        return YHProxy.newProxyInstance(new YHClassLoader(),clazz.getInterfaces(),this);
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是中介，现在确认需求！");
    }

    private void after() {
        System.out.println("需求确认的话，我就开始找啦！");
    }
}
