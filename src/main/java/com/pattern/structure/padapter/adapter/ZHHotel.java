package com.pattern.structure.padapter.adapter;

import com.pattern.structure.padapter.interfaces.ZHInterface;

/**
 * Created by timaimee on 2017/4/20.
 */
public class ZHHotel {
    private ZHInterface zhSocket;
    ZhToDeSocketAdapter zhToDeSocketAdapter;

    public ZHHotel() {
    }


    public void setZhSocket(ZHInterface zhSocket) {
        this.zhSocket = zhSocket;
    }

    public void setZhToDeSocketAdapter(ZhToDeSocketAdapter zhToDeSocketAdapter) {
        this.zhToDeSocketAdapter = zhToDeSocketAdapter;
    }

    public void chargeZhDevice() {
        if (null != zhSocket) {
            System.out.println("在中国宾馆充中国设备(无需适配)：");
            zhSocket.zhCharge();
        }
    }

    public void chargeDeDevice() {
        System.out.println("在中国宾馆充德国设备(转换适配)：");
        zhToDeSocketAdapter.zhCharge();
    }
}
