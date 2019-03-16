package com.yuehen.pattern.structure.proxy.refactor.news;

import com.yuehen.pattern.structure.proxy.refactor.old.IBankCardService;

public class BankCardServiceNew implements IBankCardService {
    public void queryUserByBankcard(){
        //
        System.out.println("查询用户信息业务功能。。。");
    }
}
