package com.yuehen.pattern.create.factory.domain;

public class AliTesters extends Testers {
    @Override
    public String getName() {
        return "阿里"+super.getName();
    }
}
