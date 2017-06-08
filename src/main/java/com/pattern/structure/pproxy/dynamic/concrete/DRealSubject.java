package com.pattern.structure.pproxy.dynamic.concrete;

import com.pattern.structure.pproxy.dynamic.interfaces.DISubject;

/**
 * Created by timaimee on 2017/6/8.
 */
public class DRealSubject implements DISubject {
    @Override
    public void request() {
        System.out.println("真实对象要处理的事");
    }
}
