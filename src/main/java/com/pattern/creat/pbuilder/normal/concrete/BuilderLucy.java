package com.pattern.creat.pbuilder.normal.concrete;

import com.pattern.creat.pbuilder.normal.abstracte.AbstractBuilder;

/**
 * Created by timaimee on 2017/4/18.
 */
public class BuilderLucy extends AbstractBuilder {
    @Override
    public void setAge() {
        personBean.setAge(20);
    }

    @Override
    public void setIdNumber() {
        personBean.setIdNumber(364235);
    }

    @Override
    public void setName() {
        personBean.setName("Lucy");

    }

    @Override
    public void setAddress() {
        personBean.setAddress("FJ");

    }
}
