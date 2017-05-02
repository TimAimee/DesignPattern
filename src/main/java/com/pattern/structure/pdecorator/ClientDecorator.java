package com.pattern.structure.pdecorator;

import com.pattern.structure.pdecorator.component.ConcreteComponent;
import com.pattern.structure.pdecorator.component.IComponent;
import com.pattern.structure.pdecorator.decorator.DecoratorA;
import com.pattern.structure.pdecorator.decorator.DecoratorB;

/**
 * [Type-Structure] Decorator Pattern
 *
 * Created by timaimee on 2017/4/26.
 */
public class ClientDecorator {
    public static void main(String[] agrs) {
        IComponent component = new ConcreteComponent();
        component.sampleOperation();
        System.out.println("----");
        IComponent decoratorA = new DecoratorA(component);
        decoratorA.sampleOperation();
        System.out.println("----");
        IComponent decoratorB = new DecoratorB(decoratorA);
        decoratorB.sampleOperation();

    }
}
