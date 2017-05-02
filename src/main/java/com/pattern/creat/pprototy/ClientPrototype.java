package com.pattern.creat.pprototy;

import com.pattern.creat.pprototy.prototype.Person;

/**
 * [Type-Create]  Prototype Pattern
 *
 * 其中复制的过程涉及到深拷贝和浅拷贝的概念
 * 深拷贝:先是拷贝对象，然后再将其内部涉及到其他对象进行拷贝
 * 浅拷贝:只是拷贝对象，而不拷贝对象内部涉及到的对旬，
 * Created by timaimee on 2017/4/15.
 * 【android源码】Intent的实现
 */
public class ClientPrototype {
    public static void main(String args[]) {
        Person personPrototype = new Person("20", "timaimee");
        personPrototype.addChild("tim");
        personPrototype.addChild("aimee");

        Person personClone = null;
        try {
            personClone = personPrototype.clone();
            personClone.addChild("cloneChild");
            personClone.setName("cloneName");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(personPrototype.toString());
        System.out.println(personClone.toString());
    }
}
