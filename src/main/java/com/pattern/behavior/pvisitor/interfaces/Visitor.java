package com.pattern.behavior.pvisitor.interfaces;

import com.pattern.behavior.pvisitor.part.Computer;
import com.pattern.behavior.pvisitor.part.Keyboard;
import com.pattern.behavior.pvisitor.part.Monitor;
import com.pattern.behavior.pvisitor.part.Mouse;

/**
 * Created by TimAimee on 2017/6/18.
 */

public interface Visitor {
    void visit(Computer computer);

    void visit(Monitor monitor);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);
}
