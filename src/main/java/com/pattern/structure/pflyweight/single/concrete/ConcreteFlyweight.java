package com.pattern.structure.pflyweight.single.concrete;

import com.pattern.structure.pflyweight.single.interfaces.Flyweight;

/**
 * Created by timaimee on 2017/6/8.
 */
public class ConcreteFlyweight implements Flyweight {
    Character character;

    public ConcreteFlyweight(Character character) {
        this.character = character;
    }

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.character);
        System.out.println("Extrinsic State = " + state);
    }
}
