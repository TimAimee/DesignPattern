package com.pattern.behavior.pobserver.observer;

/**
 * Created by timaimee on 2017/6/13.
 */
public class Hejiaojiao implements Empolyee {
    private String name;

    public Hejiaojiao(String name) {
        this.name = name;
    }

    @Override
    public void update(String string) {
        System.out.println(name + ",接收到通知:" + string);
    }

    @Override
    public String getName() {
        return name;
    }
}
