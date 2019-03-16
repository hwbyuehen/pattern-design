package com.yuehen.pattern.structure.proxy.refactor.old;

public class BankCardService implements IBankCardService {
    public void queryUserByBankcard(){
        System.out.println("start query users by bankcard.");
        long startTime = System.currentTimeMillis();

        //
        System.out.println("查询用户信息业务功能。。。");

        long endTime = System.currentTimeMillis();
        System.out.println("end query users by bankcard. cost " + (endTime - startTime) + "ms");
    }
}
