package com.epam.designpatterns.structural;

public class CompositePattern {
	public static void main(String[] args) {
        Employee employee1 = new Employee("Ram", "Programmer", 1500);
        Employee employee2 = new Employee("Rahul", "CEO", 3000);
        Employee employee3 = new Employee("David", "Manager", 2000);
        Employee employee4 = new Employee("Suraj", "Janitor", 500);
        Employee employee5 = new Employee("Sahithi", "Marketing", 1000);
        Employee employee6 = new Employee("Ali", "Sales", 2000);
        Employee employee7 = new Employee("Karthik", "Programmer", 1750);
        Employee employee8 = new Employee("Tanuja", "Programmer", 1200);
        
        
        
        employee2.addEmployee(employee4);
        employee2.addEmployee(employee5);
        employee2.addEmployee(employee6);

        for (Employee headEmployee : employee2.getEmployees()) {
            System.out.println(headEmployee.getEmployeeDetails(headEmployee));
            
        }
    }
}
