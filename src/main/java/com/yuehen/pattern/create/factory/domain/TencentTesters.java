package com.yuehen.pattern.create.factory.domain;

public class TencentTesters extends Testers {
    @Override
    public String getName() {
        return "腾讯"+super.getName();
    }
}
