package com.pattern.creat.pbuilder.complex;

import com.pattern.creat.pbuilder.bean.PersonBean;

/**
 * [Type-Create] complex builder pattern
 * Created by timaimee on 2017/4/17.
 */
public class ComplexDirector {
    PersonBean personBean;

    public ComplexDirector creatPerson() {
        personBean = new PersonBean();
        return this;
    }

    public ComplexDirector setAge(int age) {
        personBean.setAge(age);
        return this;
    }

    public ComplexDirector setName(String name) {
        personBean.setName(name);
        return this;
    }

    public ComplexDirector setAddress(String address) {
        personBean.setAddress(address);
        return this;
    }

    public ComplexDirector setIdNumber(int idNumber) {
        personBean.setIdNumber(idNumber);
        return this;
    }

    public PersonBean bulider() {
        PersonBean pPersonBean = new PersonBean();
        pPersonBean.setAge(personBean.getAge());
        pPersonBean.setName(personBean.getName());
        pPersonBean.setAddress(personBean.getAddress());
        pPersonBean.setIdNumber(personBean.getIdNumber());
        return pPersonBean;
    }

}
