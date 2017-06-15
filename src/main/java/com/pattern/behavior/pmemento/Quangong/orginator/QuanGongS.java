package com.pattern.behavior.pmemento.Quangong.orginator;

import com.pattern.behavior.pmemento.Quangong.memento.Idea;

/**
 * 项目经理 全工
 * Created by timaimee on 2017/6/15.
 */
public class QuanGongS {
    private String name;
    private String content;

    public QuanGongS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Idea createIdea() {
        return new Idea(content);
    }

    public String getState() {
        return content;
    }

    public void setState(String content) {
        this.content = content;
        System.out.println(name + "有一个想法：" + content);
    }

    public void restoreMemento(Idea idea) {
        this.content = idea.getContent();

    }
}
