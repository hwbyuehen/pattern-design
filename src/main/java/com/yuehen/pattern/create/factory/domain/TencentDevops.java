package com.yuehen.pattern.create.factory.domain;

public class TencentDevops extends Devops {
    @Override
    public String getName() {
        return "腾讯"+super.getName();
    }
}
