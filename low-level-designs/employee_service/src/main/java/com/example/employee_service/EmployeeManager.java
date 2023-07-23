package com.example.employee_service;

public class EmployeeManager {
    private static Employees list = new Employees();
    public void createEmployees() { 
        
        Employees employees = new Employees();
        // employees.addEmployee(new Employee(1, "", "", "", ""));

    }

    public Employees getAllEmployees() { 
        return list;
    }
    public void addEmployee(Employee employee) { 
        list.getEmployees().add(employee);
    }


}
