package com.yuehen.pattern.structure.proxy.refactor.news;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Tom on 2019/3/10.
 */
public class LoggerProxy implements InvocationHandler {

    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start query users by bankcard.");
        long startTime = System.currentTimeMillis();

        Object obj = method.invoke(this.target,args);

        long endTime = System.currentTimeMillis();
        System.out.println("end query users by bankcard. cost " + (endTime - startTime) + "ms");
       return obj;
    }

}
