package com.pattern.behavior.pmemento.Quangong.caretaker;

import com.pattern.behavior.pmemento.Quangong.memento.Idea;

/**
 * 项目经理 助理 邢译丹
 * Created by timaimee on 2017/6/15.
 */
public class Xingyidang {
    private String name;
    private Idea idea;

    public Xingyidang(String name) {
        this.name = name;
        System.out.println(name + "待命中...");
    }

    public Idea getIdea() {
        System.out.println(name + ",我好像忘记真的忘记之前的事了，我是不是有给过一个纸条给你，你帮我看下纸条的内容");
        System.out.println("好的，纸条拿来了，上面写着：" + idea.getContent());
        return idea;
    }

    public void setIdea(Idea idea) {
        System.out.println("我应该会忘记之前的事了， 你帮我拿着这个纸条，一会我忘记了再找你");
        this.idea = idea;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
