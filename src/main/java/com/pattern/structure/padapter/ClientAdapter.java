package com.pattern.structure.padapter;

import com.pattern.structure.padapter.abstracts.DeSocket;
import com.pattern.structure.padapter.abstracts.ZHSocket;
import com.pattern.structure.padapter.adapter.DEHotel;
import com.pattern.structure.padapter.adapter.DeToZhSocketAdapter;
import com.pattern.structure.padapter.adapter.ZHHotel;
import com.pattern.structure.padapter.adapter.ZhToDeSocketAdapter;
import com.pattern.structure.padapter.interfaces.DeInterface;
import com.pattern.structure.padapter.interfaces.ZHInterface;

/**
 * [Type-Structure]  Adapter Pattern
 *
 * Created by timaimee on 2017/4/15.
 */
public class ClientAdapter {
    public static void main(String args[]) {

        DeInterface deSocket = new DeSocket();
        ZHInterface zhSocket = new ZHSocket();

        DeToZhSocketAdapter zhSocketAdapter = new DeToZhSocketAdapter(zhSocket);
        ZhToDeSocketAdapter deSocketAdapter = new ZhToDeSocketAdapter(deSocket);

        DEHotel deHotel = new DEHotel();
        deHotel.setDeSocket(deSocket);
        System.out.println("----1----");
        deHotel.chargeDeDevice();


        ZHHotel zhHotel = new ZHHotel();
        zhHotel.setZhSocket(zhSocket);
        System.out.println("----2----");
        zhHotel.chargeZhDevice();

        deHotel.setDeToZhSocketAdapter(zhSocketAdapter);
        System.out.println("----3----");
        deHotel.chargeZhDevice();

        zhHotel.setZhToDeSocketAdapter(deSocketAdapter);
        System.out.println("----4----");
        zhHotel.chargeDeDevice();
    }
}
