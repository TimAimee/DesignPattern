package com.pattern.structure.padapter.abstracts;

import com.pattern.structure.padapter.interfaces.ZHInterface;

/**
 * Created by timaimee on 2017/4/20.
 */
public class ZHSocket implements ZHInterface {
    @Override
    public void zhCharge() {
        System.out.println("使用中国充电接口进行充电");
    }
}
