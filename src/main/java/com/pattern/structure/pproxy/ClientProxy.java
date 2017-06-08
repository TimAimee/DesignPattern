package com.pattern.structure.pproxy;

import com.pattern.structure.pproxy.dynamic.DynamicSubject;
import com.pattern.structure.pproxy.dynamic.concrete.DRealSubject;
import com.pattern.structure.pproxy.dynamic.interfaces.DISubject;
import com.pattern.structure.pproxy.statics.abstracts.Subject;
import com.pattern.structure.pproxy.statics.concrete.ProxySubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * [Type-Structure] Proxy Pattern
 * Created by timaimee on 2017/6/8.
 */
public class ClientProxy {
    public static void main(String args[]) {
        //静态代理
        System.out.println("------静态代理------");
        Subject staticSubject = new ProxySubject();
        staticSubject.request();
        //动态代理
        System.out.println("------动态代理------");
        DRealSubject dynamicSubject = new DRealSubject();
        Class dynamicSubjectClass = dynamicSubject.getClass();
        InvocationHandler handler = new DynamicSubject(dynamicSubject);
        DISubject DISubject =
                (DISubject) Proxy.newProxyInstance(dynamicSubjectClass.getClassLoader(),
                        dynamicSubjectClass.getInterfaces(), handler);
        DISubject.request();
    }
}
