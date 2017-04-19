package com.pattern.creat.pfactoryabstracter.factory;

import com.pattern.creat.pfactoryabstracter.interfaces.Cpu;
import com.pattern.creat.pfactoryabstracter.interfaces.Mainboard;

/**
 * Created by timaimee on 2017/4/19.
 */
public interface AbstractFactory {
    Cpu createCpu();

    Mainboard createMainboard();
}
