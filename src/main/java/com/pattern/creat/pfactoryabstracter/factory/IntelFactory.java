package com.pattern.creat.pfactoryabstracter.factory;

import com.pattern.creat.pfactoryabstracter.abstracts.IntelCpu;
import com.pattern.creat.pfactoryabstracter.abstracts.IntelMainBoard;
import com.pattern.creat.pfactoryabstracter.interfaces.Cpu;
import com.pattern.creat.pfactoryabstracter.interfaces.Mainboard;

/**
 * Created by timaimee on 2017/4/19.
 */
public class IntelFactory implements AbstractFactory{

    @Override
    public Cpu createCpu() {
        return new IntelCpu(3);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainBoard(5);
    }
}
