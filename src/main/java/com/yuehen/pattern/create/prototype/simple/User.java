package com.yuehen.pattern.create.prototype.simple;

public class User {
    private String name;
    private int age;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User clone(){
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        user.setAddress(this.address);
        return user;
    }
}
