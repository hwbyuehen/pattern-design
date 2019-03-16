package com.yuehen.pattern.structure.proxy;

import com.yuehen.pattern.structure.proxy.domain.Man;
import com.yuehen.pattern.structure.proxy.domain.Medium;
import com.yuehen.pattern.structure.proxy.domain.Renter;

/**
 * Created by Tom on 2019/3/10.
 */
public class YHProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Renter obj = (Renter) new Medium().getInstance(new Man());
            System.out.println(obj.getClass());
            obj.rentHouse();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
