package com.pattern.behavior.pvisitor.part;

import com.pattern.behavior.pvisitor.interfaces.ComputerPart;
import com.pattern.behavior.pvisitor.interfaces.Visitor;

/**
 * Created by TimAimee on 2017/6/18.
 */

public class Keyboard implements ComputerPart {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
