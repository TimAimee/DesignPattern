package com.pattern.behavior.pobserver.subject;

/**
 * Created by timaimee on 2017/6/13.
 */
public class WuZhong extends Company {
    private String name;

    public WuZhong(String name) {
        this.name = name;
    }

    public void notifyObserver(String state) {
        System.out.println(name + "发通知了");
        super.notifyObserver(state);
    }

}
