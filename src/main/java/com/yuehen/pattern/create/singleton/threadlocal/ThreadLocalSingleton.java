package com.yuehen.pattern.create.singleton.threadlocal;

public class ThreadLocalSingleton {
    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
