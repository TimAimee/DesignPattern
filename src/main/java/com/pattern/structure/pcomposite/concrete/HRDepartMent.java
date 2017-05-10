package com.pattern.structure.pcomposite.concrete;

import com.pattern.structure.pcomposite.abstracts.Company;

/**
 * 财务部
 * Created by timaimee on 2017/5/9.
 */
public class HRDepartMent extends Company {
    public HRDepartMent() {

    }

    public HRDepartMent(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
    }

    @Override
    public void remove(Company company) {

    }

}
