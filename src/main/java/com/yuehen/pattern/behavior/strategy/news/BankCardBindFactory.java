package com.yuehen.pattern.behavior.strategy.news;

import com.yuehen.pattern.behavior.strategy.old.EnumBank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/15
 */
public class BankCardBindFactory {

    private static Map<String, BankCardBind> ioc = new HashMap<String, BankCardBind>();
    
    static {
        ioc.put(EnumBank.INST_EBANK_ICBC.getBankNo(), new ICBCBankCardBind());
        ioc.put(EnumBank.INST_EBANK_HZBANK.getBankNo(), new HZBANKBankCardBind());
        ioc.put(EnumBank.INST_EBANK_0056.getBankNo(), new SHYLBankCardBind());
    }
    private final static BankCardBind NONE_BANKCARDBIND = new NONEBankCardBind();
    
    private BankCardBindFactory(){}

    public static BankCardBind get(String payChannelNo) {
        if (ioc.containsKey(payChannelNo)){
            return ioc.get(payChannelNo);
        }
        return NONE_BANKCARDBIND;
    }
}
