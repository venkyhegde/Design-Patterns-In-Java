package io.github.venkyhegde.singleresponsibility;

import java.util.Date;

public class Employee {

    private long employeeId;
    private String name;
    private Date dob;
    private String email;

    // Now, Employee class has been refactored to follow Single Responsibility Principle

    // Getters and Setters
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
