package com.pattern.structure.pcomposite.concrete;

import com.pattern.structure.pcomposite.abstracts.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timaimee on 2017/5/9.
 */
public class ConcreteCompany extends Company {
    List<Company> companyList;

    public ConcreteCompany() {
        companyList = new ArrayList<>();
    }

    public ConcreteCompany(String name) {
        super(name);
        companyList = new ArrayList<>();
    }


    @Override
    public void add(Company company) {
        companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + "," + getName());
        for (Company company : companyList) {
            company.display(depth + 2);
        }
    }
}
