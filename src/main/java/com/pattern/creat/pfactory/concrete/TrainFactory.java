package com.pattern.creat.pfactory.concrete;

import com.pattern.creat.pfactory.interfaces.Factory;

/**
 * Created by TimAimee on 2017/4/16.
 */
public class TrainFactory implements Factory {
    @Override
    public void run() {
        System.out.println("train is running");
    }


}
