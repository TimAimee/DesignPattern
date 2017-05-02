package com.pattern.creat.pfactory;

import com.pattern.creat.pfactory.factory.RunFactory;
import com.pattern.creat.pfactory.factory.RunType;

/**
 * [Type-Creat] Factory Pattern
 *
 * Created by TimAimee on 2017/4/16.
 */
public class ClientFactory {
    public static void main(String[] args) {
        RunFactory runFactory = new RunFactory();
        runFactory.getRunFactory(RunType.CAR).run();
        runFactory.getRunFactory(RunType.BICYCLE).run();
        runFactory.getRunFactory(RunType.TRAIN).run();
    }
}
