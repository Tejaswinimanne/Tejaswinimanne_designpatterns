package com.epam.designpatterns.structural;

import java.util.*;

public class Employee {
	private String name;
    private String position;
    private int salary;;
    private List<Employee> employeeList;
    public Employee(String name, String position, int salary) {
        this.name = name;   
        this.position = position;
        this.salary = salary;
        employeeList=new ArrayList<Employee>();
    }
    
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    
    public void removeemployee(Employee employee) {
        employeeList.remove(employee);
    }
    
    public List<Employee> getEmployees() {
        return employeeList;
    }
    
    public String getEmployeeDetails(Employee employee) {
        return "Employee : | Name: " + employee.name + ", Position: " + employee.position + ", Salary: "
             + employee.salary + " |";
    }
}
