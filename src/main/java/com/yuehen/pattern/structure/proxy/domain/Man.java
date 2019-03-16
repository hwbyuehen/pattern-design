package com.yuehen.pattern.structure.proxy.domain;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class Man implements Renter {
    @Override
    public void rentHouse() {
        System.out.println("我要租房！");
        System.out.println("性价比高，南北通透，四季如春！");
        System.out.println("交通方便！");
    }
}
