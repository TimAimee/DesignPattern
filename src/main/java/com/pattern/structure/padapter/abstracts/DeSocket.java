package com.pattern.structure.padapter.abstracts;

import com.pattern.structure.padapter.interfaces.DeInterface;

/**
 * Created by timaimee on 2017/4/20.
 */
public class DeSocket implements DeInterface {
    @Override
    public void deCharge() {
        System.out.println("使用德国充电接口进行充电");
    }
}
