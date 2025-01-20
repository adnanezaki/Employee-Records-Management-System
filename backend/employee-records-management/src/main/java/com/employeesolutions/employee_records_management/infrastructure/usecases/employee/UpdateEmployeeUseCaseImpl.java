package com.employeesolutions.employee_records_management.infrastructure.usecases.employee;

import com.employeesolutions.employee_records_management.application.employee.usecases.UpdateEmployeeUseCase;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;
import com.employeesolutions.employee_records_management.domain.employee.ports.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEmployeeUseCaseImpl implements UpdateEmployeeUseCase {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public UpdateEmployeeUseCaseImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void execute(Employee employee) {
        // Check if the employee exists before updating
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee); // Save updates the entity if it already exists
        } else {
            throw new RuntimeException("Employee not found with ID: " + employee.getId());
        }
    }
}