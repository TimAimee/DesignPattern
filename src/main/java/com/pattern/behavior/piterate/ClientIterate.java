package com.pattern.behavior.piterate;

import com.pattern.behavior.piterate.abstracts.Aggregate;
import com.pattern.behavior.piterate.abstracts.ConcreteAggregate;
import com.pattern.behavior.piterate.interfaces.Iterate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timaimee on 2017/5/2.
 */
public class ClientIterate {
    public static void main(String args[]) {

        List<Object> mData = getDataList();
        Aggregate aggregate = new ConcreteAggregate(mData);
        Iterate aggregateIterate = aggregate.createIterate();
        aggregateIterate.first();
        while (!aggregateIterate.isDone()) {
            System.out.println("current item=" + aggregateIterate.currentItem());
            aggregateIterate.next();
        }
    }

    private static List<Object> getDataList() {
        List<Object> data = new ArrayList<>();
        data.add("2");
        data.add("4");
        data.add("1");
        data.add("5");
        return data;
    }
}
