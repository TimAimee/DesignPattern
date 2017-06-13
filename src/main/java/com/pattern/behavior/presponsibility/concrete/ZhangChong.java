package com.pattern.behavior.presponsibility.concrete;

import com.pattern.behavior.presponsibility.bean.RequestHoliday;
import com.pattern.behavior.presponsibility.abstraces.AHandler;

/**
 * Created by timaimee on 2017/6/9.
 */
public class ZhangChong extends AHandler {
    private final static int DAY = 1;
    private String name;

    public ZhangChong(String name) {
        this.name = name;
    }

    @Override
    public void handler(RequestHoliday request) {
        super.handler(request);
        if (request.getDay() <= DAY) {
            System.out.println(name + ":我批准了");
        } else {
            System.out.println(name + "：我批不了,你找我的领导,我只能批准" + DAY + "内的假期");
            this.mHandler.handler(request);
        }
    }
}
