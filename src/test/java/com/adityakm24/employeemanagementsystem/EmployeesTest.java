package com.adityakm24.employeemanagementsystem;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeesTest {

    @Test
    public void testGetAllEmployees() {
        Employees employees = new Employees();
        List<Employee> employeeList = employees.getAllEmployees();

        assertEquals(2, employeeList.size());  // Assuming you have 2 employees initially
    }

    @Test
    public void testAddEmployee() {
        Employees employees = new Employees();
        Employee newEmployee = new Employee("3", "Alice", "Johnson", "alice.johnson@example.com", "Designer");

        employees.addEmployee(newEmployee);
        List<Employee> employeeList = employees.getAllEmployees();

        assertEquals(3, employeeList.size());  // After adding a new employee, size should be 3
        assertEquals("Alice", employeeList.get(2).getFirstName());  // Check if last added employee is Alice
    }
}
