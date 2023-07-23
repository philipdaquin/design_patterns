package com.example.employee_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/")
public class EmployeeController {
    private final EmployeeManager manager = new EmployeeManager();
    


    @GetMapping("/employees")
    public Employees getAllEmployees() {
        
        return manager.getAllEmployees();
    }


    @PostMapping("/employees")
    public Employee uploadEmployee(@RequestBody Employee newEmployee) {
        manager.getAllEmployees().addEmployee(newEmployee);
        return newEmployee;
    }

}
