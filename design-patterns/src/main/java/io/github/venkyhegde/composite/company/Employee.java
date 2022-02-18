package io.github.venkyhegde.composite.company;

public interface Employee {
    void showEmployeeDetail();
}

class Developer implements Employee{
    private long empId;
    private String name;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetail(){
        System.out.println("Id - "+empId+" Name - "+name);
    }
}

class Manager implements Employee{
    private long empId;
    private String name;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetail(){
        System.out.println("Id - "+empId+" Name - "+name);
    }
}
