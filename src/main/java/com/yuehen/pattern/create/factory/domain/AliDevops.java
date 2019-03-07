package com.yuehen.pattern.create.factory.domain;

public class AliDevops extends Devops {
    @Override
    public String getName() {
        return "阿里"+super.getName();
    }
}
