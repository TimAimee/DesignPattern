package com.pattern.behavior.piterate.abstracts;

import com.pattern.behavior.piterate.interfaces.ConcreteIterate;
import com.pattern.behavior.piterate.interfaces.Iterate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timaimee on 2017/5/2.
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> list = new ArrayList<>();

    public ConcreteAggregate(List<Object> list) {
        this.list = list;
    }

    @Override
   public Iterate createIterate() {
        return new ConcreteIterate(list);
    }
}
