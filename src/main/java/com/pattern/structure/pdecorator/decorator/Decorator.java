package com.pattern.structure.pdecorator.decorator;

import com.pattern.structure.pdecorator.component.IComponent;

/**
 * Created by timaimee on 2017/4/26.
 */
public class Decorator implements IComponent {
    private IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
