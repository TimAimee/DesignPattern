package com.pattern.behavior.pinterpreter.interfaces;

/**
 * Created by timaimee on 2017/6/19.
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
