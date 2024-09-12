package com.adityakm24.employeemanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private Employees employees = new Employees();

    // GET request to fetch all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employees.getAllEmployees();
    }

    // POST request to add a new employee
    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee newEmployee) {
        employees.addEmployee(newEmployee);
        return "Employee added successfully!";
    }
}
