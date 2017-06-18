package com.pattern.behavior.pvisitor;

import com.pattern.behavior.pvisitor.part.Computer;
import com.pattern.behavior.pvisitor.visitor.ComputerVisitor;

/**
 * [Type-Behavior] Visitor Pattern
 *
 * Created by TimAimee on 2017/6/18.
 */

public class ClientVisitor {
    public static void main(String agrs[]) {
        Computer computer = new Computer();
        ComputerVisitor computerVisitor = new ComputerVisitor();
        computerVisitor.visit(computer);
    }
}
