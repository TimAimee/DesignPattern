package com.pattern.behavior.pstrategy.concrete;

import com.pattern.behavior.pstrategy.interfaces.pStrategy;

/**
 * Created by TimAimee on 2017/5/1.
 */
public class ConcreteStrategty3 implements pStrategy {
    @Override
    public void excute() {
        System.out.println("select strategy 3");
    }
}
