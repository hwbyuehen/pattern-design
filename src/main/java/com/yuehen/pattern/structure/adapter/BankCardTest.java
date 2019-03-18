package com.yuehen.pattern.structure.adapter;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/18
 */
public class BankCardTest {
    public static void main(String[] args) {
        NewBankCardManager bankCardManager = new BankCardManagerAdapter();
        bankCardManager.tiedcard();
        bankCardManager.untiedcard();
    }
}
