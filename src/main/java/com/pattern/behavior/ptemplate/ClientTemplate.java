package com.pattern.behavior.ptemplate;

import com.pattern.behavior.ptemplate.abstracts.AbstractClass;
import com.pattern.behavior.ptemplate.concretes.ConcreteClass1;
import com.pattern.behavior.ptemplate.concretes.ConcreteClass2;

/**
 * [Type-Behavior] Template Pattern
 *
 * Created by timaimee on 2017/5/2.
 */
public class ClientTemplate {
    public static void main(String args[]) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        abstractClass1.templateMethod();
        System.out.println("-----");
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass2.templateMethod();
    }
}
