package com.pattern.structure.pbridge;

import com.pattern.structure.pbridge.abstraction.FileExploreAbstraction;
import com.pattern.structure.pbridge.abstraction.TxtFileExploreTxt;
import com.pattern.structure.pbridge.implementor.FileExploreImp;
import com.pattern.structure.pbridge.implementor.OracleFileExplore;

/**
 * [Type-Structure] Bridge Pattern
 * 场景:车在路上跑 [汽车，卡车，跑车，....][小路，马路，高速路，...]
 * Created by timaimee on 2017/4/27.
 */
public class ClientBridge {
    public static void main(String args[]) {
        FileExploreImp exploreImp = new OracleFileExplore();
        FileExploreAbstraction exploreAbstraction = new TxtFileExploreTxt();
        exploreAbstraction.setImplementor(exploreImp);
        exploreAbstraction.exploreFile();

    }
}
