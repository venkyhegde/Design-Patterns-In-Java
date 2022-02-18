package io.github.venkyhegde.liskov;

public abstract class Vehicle {
     abstract double getSpeed();
     abstract int getCubicCapacity();
}

class Car extends Vehicle{
    private double speed;
    private int cc;

    @Override
    double getSpeed() {
        return speed;
    }

    @Override
    int getCubicCapacity() {
        return cc;
    }

    public boolean hasMoonroof(){
        return  false;
    }
}

class Bus extends   Vehicle{
    private double speed;
    private int cc;
    @Override
    double getSpeed() {
        return speed;
    }

    @Override
    int getCubicCapacity() {
        return cc;
    }

    public boolean hasEmergencyExit(){
        return false;
    }
}
