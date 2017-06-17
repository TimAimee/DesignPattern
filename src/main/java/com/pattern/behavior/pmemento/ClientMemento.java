package com.pattern.behavior.pmemento;

import com.pattern.behavior.pmemento.Quangong.caretaker.Xingyidang;
import com.pattern.behavior.pmemento.Quangong.memento.Idea;
import com.pattern.behavior.pmemento.Quangong.orginator.QuanGongS;

/**
 * [Type-Behavior] Memento Pattern
 *
 * Created by timaimee on 2017/6/15.
 */
public class ClientMemento {
    public static void main(String[] args) {
        System.out.println("***********************备忘录模式***********************");
        QuanGongS quanGong = new QuanGongS("全工");
        quanGong.setState("用A方案实现");
        Idea idea = quanGong.createIdea();
        System.out.println(quanGong.getName() + "拿着纸条记下：" + quanGong.getState());
        System.out.println("------------------");
        Xingyidang xingyidang = new Xingyidang("译丹");
        xingyidang.setIdea(idea);
        System.out.println("------------------");

        quanGong.setState("用B方案实现");
        System.out.println(quanGong.getName() + "又拿着一张新纸条记下：" + quanGong.getState());
        System.out.println("------------------");
        System.out.println(quanGong.getName() + "，感觉B不行啊，我之前是不是有个A方案，可是我忘记了，没事！" + xingyidang.getName() + "记得呢");
        quanGong.restoreMemento(xingyidang.getIdea());
        System.out.println("------------------");
        System.out.println("原来内容是：" + quanGong.getState() + ",谢谢" + xingyidang.getName());

    }
}
