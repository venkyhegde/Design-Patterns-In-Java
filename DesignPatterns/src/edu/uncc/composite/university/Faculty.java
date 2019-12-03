package edu.uncc.composite.university;

// this is the component
public interface Faculty {
    String getDetails();
}

abstract class AbstactFaculty implements Faculty{
    String name;
    String position;
    String officeNumber;

    public AbstactFaculty(String name, String position, String officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }
}

class Professor extends AbstactFaculty{

    public Professor(String name, String position, String officeNumber) {
        super(name, position, officeNumber);
    }

    @Override
    public String getDetails() {
        return this.name+" is the "+this.position;
    }
}