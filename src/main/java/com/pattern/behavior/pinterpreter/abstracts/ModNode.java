package com.pattern.behavior.pinterpreter.abstracts;

import com.pattern.behavior.pinterpreter.interfaces.Node;

/**
 * Created by timaimee on 2017/6/19.
 */
public class ModNode extends SymbolNode {

    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() % right.interpret();
    }
}
