package com.pattern.behavior.pvisitor.part;

import com.pattern.behavior.pvisitor.interfaces.ComputerPart;
import com.pattern.behavior.pvisitor.interfaces.Visitor;

/**
 * Created by TimAimee on 2017/6/18.
 */

public class Computer implements ComputerPart {
    ComputerPart[] partsList;

    public Computer() {
        partsList = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < partsList.length; i++) {
            partsList[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
