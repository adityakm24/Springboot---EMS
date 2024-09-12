package com.adityakm24.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList = new ArrayList<>();

    public Employees() {
        // Hardcoded employee data (you can add more for testing)
        employeeList.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Manager"));
        employeeList.add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Developer"));
    }

    // Method to return all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}
