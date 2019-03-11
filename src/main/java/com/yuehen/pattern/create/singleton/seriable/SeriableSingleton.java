package com.yuehen.pattern.create.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private final static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance() {
        return seriableSingleton;
    }

    private Object readResolve() {
        return seriableSingleton;
    }
}
