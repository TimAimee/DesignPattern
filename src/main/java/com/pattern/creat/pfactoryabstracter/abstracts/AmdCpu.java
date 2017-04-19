package com.pattern.creat.pfactoryabstracter.abstracts;

import com.pattern.creat.pfactoryabstracter.interfaces.Cpu;

/**
 * Created by timaimee on 2017/4/19.
 */
public class AmdCpu implements Cpu {
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("the amd cpu count=" + pins);
    }
}
