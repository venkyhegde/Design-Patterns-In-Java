package io.github.venkyhegde.strategy.mathops;

public interface Strategy {
    int performOps(int num1, int num2);
}

class Add implements Strategy{

    @Override
    public int performOps(int num1, int num2) {
        return num1+num2;
    }
}

class Subtract implements Strategy{

    @Override
    public int performOps(int num1, int num2) {
        return num1-num2;
    }
}

class Multiply implements Strategy{

    @Override
    public int performOps(int num1, int num2) {
        return num1*num2;
    }
}