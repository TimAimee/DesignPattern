package com.pattern.creat.pfactoryabstracter.factory;

import com.pattern.creat.pfactoryabstracter.abstracts.AmdCpu;
import com.pattern.creat.pfactoryabstracter.abstracts.AmdMainBoard;
import com.pattern.creat.pfactoryabstracter.interfaces.Cpu;
import com.pattern.creat.pfactoryabstracter.interfaces.Mainboard;

/**
 * Created by timaimee on 2017/4/19.
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu(3);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainBoard(5);
    }
}
