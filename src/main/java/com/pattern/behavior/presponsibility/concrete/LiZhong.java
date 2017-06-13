package com.pattern.behavior.presponsibility.concrete;

import com.pattern.behavior.presponsibility.bean.RequestHoliday;
import com.pattern.behavior.presponsibility.abstraces.AHandler;

/**
 * Created by timaimee on 2017/6/9.
 */
public class LiZhong extends AHandler {
    private final static int DAY = 15;
    @Override
    public void handler(RequestHoliday request) {
        super.handler(request);
        if (request.getDay() <= DAY) {
            System.out.println("李总:我批准了");
        } else {
            System.out.println("李总:你这个时间有点久，我不批准,你再考虑考虑");
        }
    }
}
