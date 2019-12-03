package edu.uncc.programminginterface;

// this is a computer class.
// By using the super type of display in computer, we can dynamically switch between two displays on run time.
// Even if a new type of display which implements DisplayModule could also be used on the fly.
public class Computer {

    DisplayModule displayModule;

    public void setDisplayModule(DisplayModule displayModule){
        this.displayModule = displayModule;
    }

    public void display(){
        this.displayModule.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        DisplayModule dm1 = new Monitor(); // here declaring the type variable to super class(super type) which allow
        DisplayModule dm2 = new Projector(); // to dynamically change the display. This provides loose coupling.

        computer.setDisplayModule(dm1);
        dm1.display();
        computer.setDisplayModule(dm2);
        dm2.display();
    }

}
