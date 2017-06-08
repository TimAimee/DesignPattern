package com.pattern.structure.pflyweight.single;

import com.pattern.structure.pflyweight.single.concrete.ConcreteFlyweight;
import com.pattern.structure.pflyweight.single.interfaces.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by timaimee on 2017/6/8.
 */
public class FlyweightFactory {
    private Map<Character, Flyweight> flyWeight = new HashMap<>();

    public Flyweight getFlyweight(Character character) {
        //先从缓存中查找对象
        Flyweight fly = flyWeight.get(character);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(character);
            //把这个新的Flyweight对象添加到缓存中
            flyWeight.put(character, fly);
        }
        return fly;
    }
}
