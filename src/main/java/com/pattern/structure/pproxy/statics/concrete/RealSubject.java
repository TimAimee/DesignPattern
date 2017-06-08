package com.pattern.structure.pproxy.statics.concrete;

import com.pattern.structure.pproxy.statics.abstracts.Subject;

/**
 * Created by timaimee on 2017/6/8.
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实对象要处理的事");
    }
}
