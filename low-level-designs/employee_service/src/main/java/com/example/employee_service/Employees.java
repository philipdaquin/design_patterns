package com.example.employee_service;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

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


    public List<Employee> setEmployees(List<Employee> em) { 
        this.employees = em;
        return employees;
    }


}
