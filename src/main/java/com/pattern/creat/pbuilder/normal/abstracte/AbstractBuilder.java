package com.pattern.creat.pbuilder.normal.abstracte;

import com.pattern.creat.pbuilder.bean.PersonBean;

/**
 * Created by timaimee on 2017/4/18.
 */
public abstract class AbstractBuilder {
    protected PersonBean personBean;

    public void creatPerson() {
        personBean = new PersonBean();
    }

    public PersonBean getPersonBean() {
        return personBean;
    }


    public abstract void setAge( );


    public abstract void setIdNumber( );


    public abstract void setName( );


    public abstract void setAddress( );


}
