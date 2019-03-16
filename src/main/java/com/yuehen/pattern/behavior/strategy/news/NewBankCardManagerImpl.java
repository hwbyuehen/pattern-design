package com.yuehen.pattern.behavior.strategy.news;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class NewBankCardManagerImpl implements NewBankCardManager {

    public void updatePayChannel(String payChannelNo) {
        BankCardBindFactory.get(payChannelNo).bankcardBinding();
    }
}
