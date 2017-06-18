package com.pattern.behavior.pvisitor.visitor;

import com.pattern.behavior.pvisitor.interfaces.Visitor;
import com.pattern.behavior.pvisitor.part.Computer;
import com.pattern.behavior.pvisitor.part.Keyboard;
import com.pattern.behavior.pvisitor.part.Monitor;
import com.pattern.behavior.pvisitor.part.Mouse;

/**
 * Created by TimAimee on 2017/6/18.
 */

public class ComputerVisitor implements Visitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }
}
