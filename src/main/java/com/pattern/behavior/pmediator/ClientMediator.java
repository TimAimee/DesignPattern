package com.pattern.behavior.pmediator;

import com.pattern.behavior.pmediator.mediator.ZhanChong;
import com.pattern.behavior.pmediator.person.LiJinLiang;
import com.pattern.behavior.pmediator.person.LiZhong;

/**
 * [Type-Behavior] Mediator Pattern
 * <p>
 * Created by timaimee on 2017/6/17.
 */
public class ClientMediator {
    public static void main(String[] args) {
        System.out.println("**********中介者模式**********");
        ZhanChong zhanChong = new ZhanChong("张冲");

        LiJinLiang liJinLiang = new LiJinLiang("李金亮", zhanChong);
        LiZhong boss = new LiZhong("boss", zhanChong);

        zhanChong.setLiJinLiang(liJinLiang);
        zhanChong.setLiZhong(boss);

        liJinLiang.constact("我想购置几台安卓机");
        boss.constact("同意，只要你把申请的机型提交上来我申批下就好");
    }
}
