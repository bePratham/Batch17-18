package com.pratham.FirstApplication.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.FirstApplication.dto.EmployeeDTO;

@RestController
public class EmployeeController {
    @GetMapping(path = "/employees")
    public String getEmployees() {
        return "Hello employee";
    }

    @GetMapping(path = "employee")
    public EmployeeDTO getEmployee() {
        return new EmployeeDTO(1234L, "Pratham", LocalDate.of(2024, 5, 3), true);
    }

}
