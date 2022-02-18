package io.github.venkyhegde.strategy.mathops;

// this is the context
public class MathOps {
    public static int mathOps(Strategy operation, int num1, int num2){
        return operation.performOps(num1, num2);
    }
}
