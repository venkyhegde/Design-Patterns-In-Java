package edu.uncc.delegation;

// this is a delegator class, it delegates it's work to a delegate class. But, it looks like Printer class is the one which does the work
public class Printer {
    LaserPrinter laserPrinter = new LaserPrinter();

    // creating the delegate
    void print(String message){
        laserPrinter.print(message); // delegation
    }
}