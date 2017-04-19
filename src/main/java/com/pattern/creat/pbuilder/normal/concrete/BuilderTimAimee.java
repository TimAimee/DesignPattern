package com.pattern.creat.pbuilder.normal.concrete;

import com.pattern.creat.pbuilder.normal.abstracte.AbstractBuilder;

/**
 * Created by timaimee on 2017/4/18.
 */
public class BuilderTimAimee extends AbstractBuilder {
    @Override
    public void setAge() {
        personBean.setAge(25);
    }

    @Override
    public void setIdNumber() {
        personBean.setIdNumber(362525);
    }

    @Override
    public void setName() {
        personBean.setName("TimAimee");

    }

    @Override
    public void setAddress() {
        personBean.setAddress("JX");

    }
}
