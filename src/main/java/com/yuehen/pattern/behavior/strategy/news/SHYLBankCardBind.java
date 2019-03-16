package com.yuehen.pattern.behavior.strategy.news;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class SHYLBankCardBind implements BankCardBind {

    @Override
    public void bankcardBinding() {
        System.out.println("上海银联绑卡。。。");
    }
}
