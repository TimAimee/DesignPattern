package com.pattern.behavior.pinterpreter.interpreter;

import com.pattern.behavior.pinterpreter.abstracts.DivNode;
import com.pattern.behavior.pinterpreter.abstracts.ModNode;
import com.pattern.behavior.pinterpreter.abstracts.MulNode;
import com.pattern.behavior.pinterpreter.interfaces.Node;
import com.pattern.behavior.pinterpreter.interfaces.ValueNode;

import java.util.Stack;

/**
 * Created by timaimee on 2017/6/19.
 */
public class Calculator {
    private Node node;

    public void build(String statement) {
        Node left = null, right = null;
        Stack stack = new Stack();

        String[] statementArr = statement.split(" ");

        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new MulNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new DivNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new ModNode(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        this.node = (Node) stack.pop();
    }

    public int computer() {
        return node.interpret();
    }
}
