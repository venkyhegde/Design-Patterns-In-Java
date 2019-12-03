package edu.uncc.programminginterface;

// this is a type of display a computer may have
public class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Displaying on Monitor");
    }
}
