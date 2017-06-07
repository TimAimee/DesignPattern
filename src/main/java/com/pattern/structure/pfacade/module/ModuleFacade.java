package com.pattern.structure.pfacade.module;

/**
 * reated by timaimee on 2017/6/7.
 */
public class ModuleFacade {
    ModuleA ma = new ModuleA();
    ModuleB mb = new ModuleB();
    ModuleC mc = new ModuleC();


    public void say() {
        ma.sayA();
    }

    public void write() {
        mb.writeB();
    }

    public void listen() {
        mc.listenC();
    }
}
