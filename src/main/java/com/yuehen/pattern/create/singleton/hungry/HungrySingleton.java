package com.yuehen.pattern.create.singleton.hungry;

public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
