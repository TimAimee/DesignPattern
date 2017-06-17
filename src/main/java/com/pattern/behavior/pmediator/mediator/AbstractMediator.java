package com.pattern.behavior.pmediator.mediator;

import com.pattern.behavior.pmediator.person.AbstractPerson;

/**
 * Created by timaimee on 2017/6/17.
 */
public abstract class AbstractMediator {
    private String name;

    public AbstractMediator(String name) {
        this.name = name;
    }

    public abstract void constact(String message, AbstractPerson person);

    public String getName() {
        return name;
    }
}
