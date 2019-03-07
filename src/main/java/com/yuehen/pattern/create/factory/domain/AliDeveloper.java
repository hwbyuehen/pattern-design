package com.yuehen.pattern.create.factory.domain;

public class AliDeveloper extends Developer {
    @Override
    public String getName() {
        return "阿里"+super.getName();
    }
}
