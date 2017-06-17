package com.pattern.behavior.pmediator.person;

import com.pattern.behavior.pmediator.mediator.AbstractMediator;

/**
 * Created by timaimee on 2017/6/17.
 */
public abstract class AbstractPerson {
    public String name;
    public AbstractMediator abstractMediator;

    public AbstractPerson(String name, AbstractMediator abstractMediator) {
        this.name = name;
        this.abstractMediator = abstractMediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
