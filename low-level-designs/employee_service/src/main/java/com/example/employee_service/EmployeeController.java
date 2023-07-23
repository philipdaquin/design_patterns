package com.example.employee_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/")
public class EmployeeController {
    private final Employees employees = new Employees();
    


    @GetMapping("/employees")
    public Employees getAllEmployees() {
        
        return employees;
    }
}
