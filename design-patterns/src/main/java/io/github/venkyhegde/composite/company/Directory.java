package io.github.venkyhegde.composite.company;

import java.util.ArrayList;
import java.util.List;

// this is the composite
public class Directory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetail() {
        for (Employee employee: employeeList){
            employee.showEmployeeDetail();
        }
    }

  /**   below operations such as add / remove should have been the part of Employee interface as per composite design
   *  pattern, but it breaks single responsibility principle which is the trade off of following strict composite
   *  pattern.
   */

  public void addEMployee(Employee emp){
      employeeList.add(emp);
  }

  public void removeEmployee(Employee emp){
      employeeList.remove(emp);
  }

}
