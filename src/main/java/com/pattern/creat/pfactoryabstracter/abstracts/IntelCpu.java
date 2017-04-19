package com.pattern.creat.pfactoryabstracter.abstracts;

import com.pattern.creat.pfactoryabstracter.interfaces.Cpu;

/**
 * Created by timaimee on 2017/4/19.
 */
public class IntelCpu implements Cpu {
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("the intel cpu count=" + pins);
    }
}
