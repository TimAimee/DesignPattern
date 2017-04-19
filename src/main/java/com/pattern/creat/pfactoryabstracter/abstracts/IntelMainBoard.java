package com.pattern.creat.pfactoryabstracter.abstracts;

import com.pattern.creat.pfactoryabstracter.interfaces.Mainboard;

/**
 * Created by timaimee on 2017/4/19.
 */
public class IntelMainBoard implements Mainboard {

    private int cpuHoles;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("the intel holes count=" + cpuHoles);
    }
}
