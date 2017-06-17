package com.pattern.behavior.pmediator.person;

import com.pattern.behavior.pmediator.mediator.AbstractMediator;

/**
 * Created by timaimee on 2017/6/17.
 */
public class LiZhong extends AbstractPerson {
    public LiZhong(String name, AbstractMediator abstractMediator) {
        super(name, abstractMediator);
    }

    public void constact(String name) {
        this.abstractMediator.constact(name, this);
    }

    public void getMessage(String message) {
        System.out.println(name + ",get message=" + message);
        System.out.println(name + ",我知道了,谢谢你,"+abstractMediator.getName());
    }
}
