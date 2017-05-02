package com.pattern.behavior.ptemplate.abstracts;

/**
 * Created by timaimee on 2017/5/2.
 */
public abstract class AbstractClass {
    protected abstract void absMethod();

    protected void hookMethod() {
        System.out.println("hook method from abstract class");
    }

    private final void concreteMethod() {
        System.out.println("base concreteMethod");
    }

    public void templateMethod() {
        absMethod();
        hookMethod();
        concreteMethod();
    }
}
