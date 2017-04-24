
package com.pattern.structure.padapter.adapter;

import com.pattern.structure.padapter.interfaces.DeInterface;
import com.pattern.structure.padapter.interfaces.ZHInterface;

/**
 * Created by timaimee on 2017/4/20.
 */
public class ZhToDeSocketAdapter implements ZHInterface {
    public DeInterface deInterface;

    public ZhToDeSocketAdapter(DeInterface deInterface) {
        this.deInterface = deInterface;
    }

    @Override
    public void zhCharge() {
        deInterface.deCharge();
    }
}
