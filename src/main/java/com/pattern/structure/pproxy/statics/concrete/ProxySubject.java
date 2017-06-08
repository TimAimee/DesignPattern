package com.pattern.structure.pproxy.statics.concrete;

import com.pattern.structure.pproxy.statics.abstracts.Subject;

/**
 * Created by timaimee on 2017/6/8.
 */
public class ProxySubject extends Subject {
    RealSubject realSubject;

    private void doBeforeRequest() {
        System.out.println("代理对象在真实对象完成处理之前的操作");
    }

    @Override
    public void request() {
        doBeforeRequest();
        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        doAfterRequest();
    }

    public void doAfterRequest() {
        System.out.println("代理对象在真实对象完成处理之后的操作");
    }

}
