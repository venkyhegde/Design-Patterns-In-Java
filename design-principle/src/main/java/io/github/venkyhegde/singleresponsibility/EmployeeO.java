package io.github.venkyhegde.singleresponsibility;

import java.util.Date;

public class EmployeeO {
    private long employeeId;
    private String name;
    private Date dob;
    private String email;

    public boolean isPromotionPending(){
        // Logic to decide if promotion is pending or not
        return false;
    }

    public double incomeTaxForCurrentYear(){
        // Logic to calculate income tax for the year using employee object.
        return 0;
    }

    // Here the functionality isPromotionPending and incomeTaxForCurrentYear are not directly related to employee.
    // incomeTaxForCurrentYear is related to finance department in a company and it changes every ever. If we make
    // this as part of Employee class, then we may have to change/modify employee class every year as income tax
    // changes. Similarly, isPromotionPending should be part of HR operations, which may or may not change often.
    // SO, this class breaks Single Responsibility Principle.

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
