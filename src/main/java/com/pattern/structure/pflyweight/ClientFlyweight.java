package com.pattern.structure.pflyweight;

import com.pattern.structure.pflyweight.single.FlyweightFactory;
import com.pattern.structure.pflyweight.single.interfaces.Flyweight;

/**
 * [Type-Structure] Flyweight Pattern
 * Created by timaimee on 2017/6/8.
 */
public class ClientFlyweight {
    public static void main(String args[]) {
        //内蕴状态
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.getFlyweight(new Character('a'));
        fly.operation("First Call");
        System.out.println(fly.toString());

        fly = factory.getFlyweight(new Character('b'));
        fly.operation("Second Call");
        System.out.println(fly.toString());

        fly = factory.getFlyweight(new Character('a'));
        fly.operation("Third Call");
        System.out.println(fly.toString());
    }
}
