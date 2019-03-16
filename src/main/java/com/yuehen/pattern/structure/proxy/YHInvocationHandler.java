package com.yuehen.pattern.structure.proxy;

import java.lang.reflect.Method;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public interface YHInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
