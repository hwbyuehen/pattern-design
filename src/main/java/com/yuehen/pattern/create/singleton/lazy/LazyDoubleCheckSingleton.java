package com.yuehen.pattern.create.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (lazyDoubleCheckSingleton) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
                return lazyDoubleCheckSingleton;
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
