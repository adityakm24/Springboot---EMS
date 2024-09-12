package com.adityakm24.employeemanagementsystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Test for GET /employees
    @Test
    public void testGetAllEmployees() throws Exception {
        mockMvc.perform(get("/employees")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())  // Expect 200 OK response
                .andExpect(jsonPath("$[0].employeeId").value("1"))  // Check if first employee has id 1
                .andExpect(jsonPath("$[1].firstName").value("Jane"));  // Check if second employee has first name Jane
    }

    // Test for POST /employees
    @Test
    public void testAddEmployee() throws Exception {
        String newEmployeeJson = "{ \"employeeId\": \"3\", \"firstName\": \"Alice\", \"lastName\": \"Johnson\", \"email\": \"alice.johnson@example.com\", \"title\": \"Designer\" }";

        mockMvc.perform(post("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(newEmployeeJson))
                .andExpect(status().isOk());  // Expect 200 OK response for successful POST
    }
}
