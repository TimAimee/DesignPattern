package com.pattern.behavior.presponsibility.bean;

/**
 * Created by timaimee on 2017/6/9.
 */
public class RequestHoliday {
    String name;
    int day;

    public RequestHoliday(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "批条{" +
                name +
                ":我想请" + day + "天出去旅游,能给批准下不" +
                '}';
    }
}
