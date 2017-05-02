package com.pattern.structure.pdecorator.component;

/**
 * Created by timaimee on 2017/4/26.
 */
public class ConcreteComponent implements IComponent {
    @Override
    public void sampleOperation() {
        System.out.println("I can move");
    }
}
