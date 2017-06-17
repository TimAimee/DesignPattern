package com.pattern.behavior.pmediator.mediator;

import com.pattern.behavior.pmediator.person.AbstractPerson;
import com.pattern.behavior.pmediator.person.LiJinLiang;
import com.pattern.behavior.pmediator.person.LiZhong;

/**
 * Created by timaimee on 2017/6/17.
 */
public class ZhanChong extends AbstractMediator {
    private LiZhong liZhong;
    private LiJinLiang liJinLiang;

    public ZhanChong(String name) {
        super(name);
    }


    public LiZhong getLiZhong() {
        return liZhong;
    }

    public void setLiZhong(LiZhong liZhong) {
        this.liZhong = liZhong;
    }

    public LiJinLiang getLiJinLiang() {
        return liJinLiang;
    }

    public void setLiJinLiang(LiJinLiang liJinLiang) {
        this.liJinLiang = liJinLiang;
    }

    @Override
    public void constact(String message, AbstractPerson person) {
        System.out.println("----------------------------------------");

        if (person == liJinLiang) {
            System.out.println(person.getName() + ":" + getName() + ",帮我跟" + liZhong.getName() + "说下,\"" + message + "\"");
            System.out.println("好的，我会传达的!");
            System.out.println(getName() + "-->" + liZhong.getName() + ":" + person.getName() + "说\"" + message + "\"");
            liZhong.getMessage(message);
        } else {
            System.out.println(person.getName() + ":" + getName() + ",帮我跟" + liJinLiang.getName() + "说下,\"" + message + "\"");
            System.out.println("好的，我会传达的!");
            System.out.println(getName() + "-->" + liJinLiang.getName() + ":" + person.getName() + "说\"" + message + "\"");
            liJinLiang.getMessage(message);
        }
    }
}
