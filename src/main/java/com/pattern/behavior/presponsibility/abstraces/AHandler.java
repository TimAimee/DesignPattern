package com.pattern.behavior.presponsibility.abstraces;

import com.pattern.behavior.presponsibility.bean.RequestHoliday;

/**
 * Created by timaimee on 2017/6/9.
 */
public abstract class AHandler {
    public AHandler mHandler = null;

    public void setNextHandler(AHandler handler) {
        this.mHandler = handler;

    }

    public void handler(RequestHoliday request) {
        System.out.println(request.toString());
    }

}
