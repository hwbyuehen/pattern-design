package com.yuehen.pattern.create.prototype;

import com.yuehen.pattern.create.prototype.deep.DeepUser;
import com.yuehen.pattern.create.prototype.simple.Address;
import com.yuehen.pattern.create.prototype.simple.User;

public class PrototypeTest {
    public static void main(String[] args) {
        //1、浅克隆
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        Address address = new Address();
        address.setCity("杭州");
        address.setStreet("大大街道");
        user.setAddress(address);
        System.out.println("浅克隆："+user);

        User user1 = user.clone();
        System.out.println("浅克隆："+user1);
        System.out.println(user.getAddress() == user1.getAddress());

        //2、深克隆
        DeepUser deepUser = new DeepUser();
        deepUser.setName("张三");
        deepUser.setAge(18);
        Address deepAddress = new Address();
        deepAddress.setCity("杭州");
        deepAddress.setStreet("大大街道");
        deepUser.setAddress(deepAddress);
        System.out.println("深克隆："+deepUser);

        DeepUser userdeep = (DeepUser)deepUser.deepClone();
        System.out.println("深克隆："+userdeep);
        System.out.println(deepUser.getAddress() == userdeep.getAddress());
    }
}
