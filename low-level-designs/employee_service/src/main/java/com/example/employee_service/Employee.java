package com.example.employee_service;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    public Employee(
        Integer i,
        String firstName,
        String lastName,
        String email,
        String title
    ) { 
        this.employeeId = i;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
    }

}
