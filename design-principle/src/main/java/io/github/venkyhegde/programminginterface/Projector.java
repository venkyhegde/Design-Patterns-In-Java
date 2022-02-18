package io.github.venkyhegde.programminginterface;

// another type of display
public class Projector implements DisplayModule {

    @Override
    public void display() {
        System.out.println("Displaying on Projector");
    }
}
