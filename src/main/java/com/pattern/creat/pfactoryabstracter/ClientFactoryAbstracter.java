package com.pattern.creat.pfactoryabstracter;

import com.pattern.creat.pfactoryabstracter.factory.AbstractFactory;
import com.pattern.creat.pfactoryabstracter.factory.ComputerEngineer;
import com.pattern.creat.pfactoryabstracter.factory.IntelFactory;

/**
 * [Type-Create] Abstracter Factory Pattern
 *
 * Created by timaimee on 2017/4/19.
 */
public class ClientFactoryAbstracter {
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer computerEngineer = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory abstractFactory = new IntelFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        computerEngineer.prepareHardWares(abstractFactory);
    }
}
