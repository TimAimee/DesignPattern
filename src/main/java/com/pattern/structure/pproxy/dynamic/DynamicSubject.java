package com.pattern.structure.pproxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by timaimee on 2017/6/8.
 */
public class DynamicSubject implements InvocationHandler {
    //真实对象的引用
    private Object sub;

    public DynamicSubject(Object object) {
        this.sub = object;
    }

    private void doBeforeRequest() {
        System.out.println("代理对象在真实对象完成处理之前的操作");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBeforeRequest();
        method.invoke(sub, args);
        doAfterRequest();
        return null;
    }

    public void doAfterRequest() {
        System.out.println("代理对象在真实对象完成处理之后的操作");
    }
}
