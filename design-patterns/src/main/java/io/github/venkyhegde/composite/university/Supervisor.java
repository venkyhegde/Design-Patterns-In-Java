package io.github.venkyhegde.composite.university;

import java.util.ArrayList;
import java.util.List;

// this is the composite
public class Supervisor implements Faculty {

    private String name;
    private String deptName;

    private List<Faculty> facultyList;

    Supervisor(String name, String deptName){
        this.name = name;
        this.deptName = deptName;
        facultyList = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return this.name+" is the "+this.deptName;
    }

    // these methods can also be part of interface
    public void add(Faculty professor){
        facultyList.add(professor);
    }

    public void remove(Faculty professor){
        facultyList.remove(professor);
    }

    public List<Faculty> getFaculties(){
        return facultyList;
    }
}
