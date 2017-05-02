package com.pattern.structure.pdecorator.decorator;

import com.pattern.structure.pdecorator.component.IComponent;

/**
 * Created by timaimee on 2017/4/26.
 */
public class DecoratorB extends Decorator {
    public DecoratorB(IComponent component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("I can swim");
    }
}
