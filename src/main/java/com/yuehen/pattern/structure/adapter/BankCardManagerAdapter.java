package com.yuehen.pattern.structure.adapter;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/18
 */
public class BankCardManagerAdapter extends BankCardManager implements NewBankCardManager {

    @Override
    public void tiedcard() {
        bangka();
    }

    @Override
    public void untiedcard() {
        jiebang();
    }
}
