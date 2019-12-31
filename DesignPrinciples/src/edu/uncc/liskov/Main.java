package edu.uncc.liskov;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.getCubicCapacity();

        Vehicle vehicle1 = new Bus();
        vehicle.getSpeed();

        /**
         * Here the sub class types will substitute the super class dynamically.
         */
    }
}
