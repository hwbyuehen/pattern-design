package com.yuehen.pattern.create.factory.domain;

public class TencentDeveloper extends Developer {
    @Override
    public String getName() {
        return "腾讯"+super.getName();
    }
}
