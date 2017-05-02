package com.pattern.behavior.ptemplate.concretes;

import com.pattern.behavior.ptemplate.abstracts.AbstractClass;

/**
 * Created by timaimee on 2017/5/2.
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void absMethod() {
        System.out.println("absMethod from concreteClass 2");
    }

    @Override
    protected void hookMethod() {
        super.hookMethod();
        System.out.println("hook method from concreteClass 2");
    }
}
