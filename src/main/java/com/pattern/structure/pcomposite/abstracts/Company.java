package com.pattern.structure.pcomposite.abstracts;

/**
 * Created by timaimee on 2017/5/9.
 */
public abstract class Company {
    public String name;

    public Company() {

    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

}
