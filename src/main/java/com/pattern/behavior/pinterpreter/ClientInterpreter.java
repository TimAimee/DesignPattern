package com.pattern.behavior.pinterpreter;

import com.pattern.behavior.pinterpreter.interpreter.Calculator;

/**
 * Created by timaimee on 2017/6/19.
 */
public class ClientInterpreter {
    public static void main(String agrs[]) {
        String statement = "3 * 2 * 4 / 6 % 5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result = calculator.computer();
        System.out.println(statement + " = " + result);
    }
}
