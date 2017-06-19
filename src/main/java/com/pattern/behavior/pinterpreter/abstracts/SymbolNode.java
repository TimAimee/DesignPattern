package com.pattern.behavior.pinterpreter.abstracts;

import com.pattern.behavior.pinterpreter.interfaces.Node;

/**
 * Created by timaimee on 2017/6/19.
 */
public abstract class SymbolNode implements Node {
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
