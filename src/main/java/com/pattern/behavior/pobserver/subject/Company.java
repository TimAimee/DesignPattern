package com.pattern.behavior.pobserver.subject;

import com.pattern.behavior.pobserver.observer.Empolyee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timaimee on 2017/6/13.
 */
public abstract class Company {
    public List<Empolyee> arrayList = new ArrayList<>();

    public void attach(Empolyee observer) {
        System.out.println("新同事入职了，他是" + observer.getName());
        arrayList.add(observer);
    }

    public void delete(Empolyee observer) {
        if (arrayList.contains(observer)) {
            arrayList.remove(observer);
        }
    }

    public void notifyObserver(String string) {
        for (Empolyee empolyee : arrayList) {
            empolyee.update(string);
        }
    }


}
