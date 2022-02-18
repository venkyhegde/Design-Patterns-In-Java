package io.github.venkyhegde.strategy.mathops;

public class Client {
    public static void main(String[] args) {
        int res = MathOps.mathOps(new Add(),10,24);
        System.out.println("10 + 24 = "+res);

        res = MathOps.mathOps(new Subtract(),10,24);
        System.out.println("10 - 24 = "+res);

        res = MathOps.mathOps(new Multiply(),10,24);
        System.out.println("10 X 24 = "+res);

    }
}
