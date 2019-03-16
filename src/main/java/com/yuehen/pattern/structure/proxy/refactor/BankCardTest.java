package com.yuehen.pattern.structure.proxy.refactor;

import com.yuehen.pattern.structure.proxy.refactor.news.BankCardServiceNew;
import com.yuehen.pattern.structure.proxy.refactor.news.LoggerProxy;
import com.yuehen.pattern.structure.proxy.refactor.old.BankCardService;
import com.yuehen.pattern.structure.proxy.refactor.old.IBankCardService;

import java.lang.reflect.Method;

public class BankCardTest {
    public static void main(String[] args) {
        IBankCardService bankCardService = new BankCardService();
        bankCardService.queryUserByBankcard();

//        IBankCardService ba
        try {
            IBankCardService bankCardServiceNew = new BankCardServiceNew();
            Object obj = new LoggerProxy().getInstance(bankCardServiceNew);
            Method method = obj.getClass().getMethod("queryUserByBankcard",null);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
