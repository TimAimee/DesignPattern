package com.pattern.structure.pfacade;

import com.pattern.structure.pfacade.module.ModuleFacade;

/**
 * [Type-Structure] Facade Pattern
 * Created by timaimee on 2017/6/7.
 */
public class ClientFacade {
    public static void main(String[] args) {
        ModuleFacade moduleFacade = new ModuleFacade();
        moduleFacade.say();
        moduleFacade.listen();
        moduleFacade.write();
    }
}
