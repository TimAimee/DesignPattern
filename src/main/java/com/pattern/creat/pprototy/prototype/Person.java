package com.pattern.creat.pprototy.prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Person implements Cloneable {
    private String age;
    private String name;
    private ArrayList<String> mChlid = new ArrayList<>();

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChild(String childName) {
        mChlid.add(childName);
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        //加此行表示深拷贝
        person.mChlid=(ArrayList<String>)this.mChlid.clone();
        return person;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", mChlid=" + String.join(",",mChlid) +
                '}';
    }
}
