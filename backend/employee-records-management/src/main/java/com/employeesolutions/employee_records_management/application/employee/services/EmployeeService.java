package com.employeesolutions.employee_records_management.application.employee.services;

import com.employeesolutions.employee_records_management.application.employee.dtos.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    void addEmployee(EmployeeDTO employeeDTO);
    void updateEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(Long employeeId);
    List<EmployeeDTO> searchEmployees(String searchQuery);
}