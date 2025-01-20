package com.employeesolutions.employee_records_management.application.employee.usecases;

import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;

public interface AddEmployeeUseCase {
    void execute(Employee employee);
}