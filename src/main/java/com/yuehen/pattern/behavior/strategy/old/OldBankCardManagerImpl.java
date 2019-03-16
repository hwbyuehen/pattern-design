package com.yuehen.pattern.behavior.strategy.old;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class OldBankCardManagerImpl implements OldBankCardManager {

    public void updatePayChannel(String payChannelNo) {
        if (StringUtils.equals(EnumBank.INST_EBANK_ICBC.getBankNo(), payChannelNo)) {
            System.out.println("工商银行绑卡。。。");
        } else if(StringUtils.equals(EnumBank.INST_EBANK_HZBANK.getBankNo(), payChannelNo)) {
            System.out.println("杭州银行绑卡。。。");
        } else if(StringUtils.equals(EnumBank.INST_EBANK_0056.getBankNo(), payChannelNo)) {
            System.out.println("上海银联绑卡。。。");
        } else {
            System.out.println("无效卡号");
        }
    }
}
