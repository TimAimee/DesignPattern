package com.pattern.structure.padapter.adapter;

import com.pattern.structure.padapter.interfaces.DeInterface;

/**
 * Created by timaimee on 2017/4/20.
 */
public class DEHotel {
    private DeInterface deSocket;
    DeToZhSocketAdapter deToZhSocketAdapter;

    public DEHotel() {
    }

    public void setDeSocket(DeInterface deSocket) {
        this.deSocket = deSocket;
    }

    public void setDeToZhSocketAdapter(DeToZhSocketAdapter deToZhSocketAdapter) {
        this.deToZhSocketAdapter = deToZhSocketAdapter;
    }

    public void chargeDeDevice() {
        if (null != deSocket) {
            System.out.println("在德国宾馆充德国设备(无需适配)：");
            deSocket.deCharge();
        }
    }

    public void chargeZhDevice() {
        System.out.println("在德国宾馆充中国设备(转换适配)：");
        deToZhSocketAdapter.deCharge();
    }
}
