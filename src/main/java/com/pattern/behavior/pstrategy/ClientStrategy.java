package com.pattern.behavior.pstrategy;

import com.pattern.behavior.pstrategy.concrete.ConcreteStrategty1;
import com.pattern.behavior.pstrategy.concrete.ConcreteStrategty2;
import com.pattern.behavior.pstrategy.concrete.ConcreteStrategty3;
import com.pattern.behavior.pstrategy.interfaces.pStrategy;

/**
 * Created by TimAimee on 2017/5/1.
 */
public class ClientStrategy {
    public static void main(String[] args) {
        pStrategy strategy1 = new ConcreteStrategty1();
        strategy1.excute();
        pStrategy strategy2 = new ConcreteStrategty2();
        strategy2.excute();
        pStrategy strategy3 = new ConcreteStrategty3();
        strategy3.excute();
    }
}
