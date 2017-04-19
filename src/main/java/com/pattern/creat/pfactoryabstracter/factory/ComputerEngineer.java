package com.pattern.creat.pfactoryabstracter.factory;

import com.pattern.creat.pfactoryabstracter.interfaces.Cpu;
import com.pattern.creat.pfactoryabstracter.interfaces.Mainboard;

/**
 * Created by timaimee on 2017/4/19.
 */
public class ComputerEngineer {
    private Cpu cpu;
    private Mainboard mainboard;
    public void prepareHardWares(AbstractFactory abstractFactory){
        this.cpu=abstractFactory.createCpu();
        this.mainboard=abstractFactory.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCpu();
    }
}
