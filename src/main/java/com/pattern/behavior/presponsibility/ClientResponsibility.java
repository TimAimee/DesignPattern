package com.pattern.behavior.presponsibility;

import com.pattern.behavior.presponsibility.concrete.LiZhong;
import com.pattern.behavior.presponsibility.concrete.QuanGong;
import com.pattern.behavior.presponsibility.concrete.WuZhong;
import com.pattern.behavior.presponsibility.concrete.ZhandChong;

/**
 * Created by timaimee on 2017/6/9.
 */
public class ClientResponsibility {
    public static void main(String args[]) {
        System.out.println("******责任链模式******");
        ZhandChong zhandChong = new ZhandChong("张冲");
        ZhandChong lanyan = new ZhandChong("兰燕");
        QuanGong quanGong = new QuanGong();
        WuZhong wuZhong = new WuZhong();
        LiZhong liZhong = new LiZhong();

        zhandChong.setNextHandler(quanGong);
        quanGong.setNextHandler(wuZhong);
        wuZhong.setNextHandler(liZhong);

        lanyan.setNextHandler(quanGong);
        quanGong.setNextHandler(wuZhong);
        wuZhong.setNextHandler(liZhong);

        com.pattern.behavior.presponsibility.bean.RequestHoliday requestHolidaylll = new com.pattern.behavior.presponsibility.bean.RequestHoliday("李金亮", 1);
        zhandChong.handler(requestHolidaylll);

        System.out.println("————");
        com.pattern.behavior.presponsibility.bean.RequestHoliday requestHolidaycd = new com.pattern.behavior.presponsibility.bean.RequestHoliday("陈弟", 3);
        zhandChong.handler(requestHolidaycd);

        System.out.println("————");
        com.pattern.behavior.presponsibility.bean.RequestHoliday requestHolidayzt = new com.pattern.behavior.presponsibility.bean.RequestHoliday("张婷", 5);
        zhandChong.handler(requestHolidayzt);

        System.out.println("————");
        com.pattern.behavior.presponsibility.bean.RequestHoliday requestHolidaylili = new com.pattern.behavior.presponsibility.bean.RequestHoliday("莉莉", 10);
        lanyan.handler(requestHolidaylili);

        System.out.println("————");
        com.pattern.behavior.presponsibility.bean.RequestHoliday requestHolidayyanli = new com.pattern.behavior.presponsibility.bean.RequestHoliday("阳莉", 16);
        lanyan.handler(requestHolidayyanli);

    }
}
