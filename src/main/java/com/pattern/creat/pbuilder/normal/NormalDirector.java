package com.pattern.creat.pbuilder.normal;

import com.pattern.creat.pbuilder.bean.PersonBean;
import com.pattern.creat.pbuilder.normal.abstracte.AbstractBuilder;

/**
 * Created by timaimee on 2017/4/18.
 */
public class NormalDirector {
    AbstractBuilder personBuilder;

    public void setPersonBuilder(AbstractBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public PersonBean getPerson() {
        return personBuilder.getPersonBean();
    }

    public void creatPerson() {
        personBuilder.creatPerson();
        personBuilder.setName();
        personBuilder.setIdNumber();
        personBuilder.setAge();
        personBuilder.setAddress();
    }
}
