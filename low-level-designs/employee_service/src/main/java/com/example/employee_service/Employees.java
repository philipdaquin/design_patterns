package com.example.employee_service;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    public List<Employee> employees;

    public Boolean addEmployee(Employee employee) { 

        employees.add(employee);
        return true;
    }

    public List<Employee> getEmployees() {
        if (employees == null) { 
        employees = new ArrayList<>();
        }


        return employees;
    }


}
