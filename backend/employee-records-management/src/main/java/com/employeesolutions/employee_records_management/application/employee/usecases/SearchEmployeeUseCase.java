package com.employeesolutions.employee_records_management.application.employee.usecases;

import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;

import java.util.List;

public interface SearchEmployeeUseCase {
    List<Employee> execute(String searchQuery);
}