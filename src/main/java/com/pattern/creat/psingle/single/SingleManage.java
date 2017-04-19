package com.pattern.creat.psingle.single;

/**
 * 枚举的单例写法
 * Created by timaimee on 2017/4/15.
 */
public enum  SingleManage {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
