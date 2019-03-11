package com.yuehen.pattern.create.singleton.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private final static LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
