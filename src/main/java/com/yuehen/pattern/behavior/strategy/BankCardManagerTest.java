package com.yuehen.pattern.behavior.strategy;

import com.yuehen.pattern.behavior.strategy.news.NewBankCardManager;
import com.yuehen.pattern.behavior.strategy.news.NewBankCardManagerImpl;
import com.yuehen.pattern.behavior.strategy.old.OldBankCardManager;
import com.yuehen.pattern.behavior.strategy.old.OldBankCardManagerImpl;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class BankCardManagerTest {
    public static void main(String[] args) {
//        String payChannelNo = EnumBank.INST_EBANK_ICBC.getBankNo();
        String payChannelNo = "0101";
        
        //老的if...else...
        OldBankCardManager bankCardManager = new OldBankCardManagerImpl();
        bankCardManager.updatePayChannel(payChannelNo);

        //新的根据各个类的实现
        NewBankCardManager bankCardManager1 = new NewBankCardManagerImpl();
        bankCardManager1.updatePayChannel(payChannelNo);
    }
}
