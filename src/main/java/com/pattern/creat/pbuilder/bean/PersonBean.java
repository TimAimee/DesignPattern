package com.pattern.creat.pbuilder.bean;

/**
 * Created by timaimee on 2017/4/17.
 */
public class PersonBean {
    private int age;
    private int idNumber;
    private String name;
    private String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ",age=" + age +
                ", idNumber=" + idNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
