package com.pattern.behavior.pobserver;

import com.pattern.behavior.pobserver.observer.Hejiaojiao;
import com.pattern.behavior.pobserver.observer.Lijinliang;
import com.pattern.behavior.pobserver.observer.Empolyee;
import com.pattern.behavior.pobserver.observer.XiaoPeng;
import com.pattern.behavior.pobserver.subject.WuZhong;
import com.pattern.behavior.pobserver.subject.Company;

/**
 * Created by timaimee on 2017/6/13.
 */
public class ClientObserver {
    public static void main(String args[]) {
        Company wuZhong = new WuZhong("吴总");
        Empolyee ljl = new Lijinliang("李金亮");
        Empolyee hjj = new Hejiaojiao("何姣姣");
        Empolyee xp = new XiaoPeng("肖鹏");
        wuZhong.attach(ljl);
        wuZhong.attach(hjj);
        wuZhong.attach(xp);
        wuZhong.notifyObserver("同事们注意,这周日出去旅游");
    }
}
