package com.pattern.structure.padapter.adapter;

import com.pattern.structure.padapter.interfaces.DeInterface;
import com.pattern.structure.padapter.interfaces.ZHInterface;

/**
 * Created by timaimee on 2017/4/20.
 */
public class DeToZhSocketAdapter implements DeInterface {
    public ZHInterface zhInterface;

    public DeToZhSocketAdapter(ZHInterface zhInterface) {
        this.zhInterface = zhInterface;
    }

    @Override
    public void deCharge() {
        zhInterface.zhCharge();
    }
}
