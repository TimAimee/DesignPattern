package com.pattern.behavior.presponsibility;

import com.pattern.behavior.presponsibility.concrete.LiZhong;
import com.pattern.behavior.presponsibility.concrete.QuanGong;
import com.pattern.behavior.presponsibility.concrete.WuZhong;
import com.pattern.behavior.presponsibility.concrete.ZhangChong;
import com.pattern.behavior.presponsibility.bean.RequestHoliday;

/**
 * Created by timaimee on 2017/6/9.
 */
public class ClientResponsibility {
    public static void main(String args[]) {
        System.out.println("******责任链模式******");
        ZhangChong zhangChong = new ZhangChong("张冲");
        ZhangChong lanyan = new ZhangChong("兰燕");
        QuanGong quanGong = new QuanGong();
        WuZhong wuZhong = new WuZhong();
        LiZhong liZhong = new LiZhong();

        zhangChong.setNextHandler(quanGong);
        quanGong.setNextHandler(wuZhong);
        wuZhong.setNextHandler(liZhong);

        lanyan.setNextHandler(quanGong);
        quanGong.setNextHandler(wuZhong);
        wuZhong.setNextHandler(liZhong);

        RequestHoliday requestHolidaylll = new RequestHoliday("李金亮", 1);
        zhangChong.handler(requestHolidaylll);

        System.out.println("————");
        RequestHoliday requestHolidaycd = new RequestHoliday("陈弟", 3);
        zhangChong.handler(requestHolidaycd);

        System.out.println("————");
        RequestHoliday requestHolidayzt = new RequestHoliday("张婷", 5);
        zhangChong.handler(requestHolidayzt);

        System.out.println("————");
        RequestHoliday requestHolidaylili = new RequestHoliday("莉莉", 10);
        lanyan.handler(requestHolidaylili);

        System.out.println("————");
        RequestHoliday requestHolidayyanli = new RequestHoliday("阳莉", 16);
        lanyan.handler(requestHolidayyanli);

    }
}
