package com.yuehen.pattern.behavior.strategy.news;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class ICBCBankCardBind implements BankCardBind {

    @Override
    public void bankcardBinding() {
        System.out.println("工商银行绑卡。。。");
    }
}
