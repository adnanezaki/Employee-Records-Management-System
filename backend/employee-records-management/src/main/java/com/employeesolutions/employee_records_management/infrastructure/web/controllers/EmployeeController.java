package com.employeesolutions.employee_records_management.infrastructure.web.controllers;

import com.employeesolutions.employee_records_management.application.employee.dtos.EmployeeDTO;
import com.employeesolutions.employee_records_management.application.employee.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.addEmployee(employeeDTO);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        employeeDTO.setId(id); // Ensure the ID is set for the update
        employeeService.updateEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/search")
    public List<EmployeeDTO> searchEmployees(@RequestParam String query) {
        return employeeService.searchEmployees(query);
    }
}