package com.employeesolutions.employee_records_management.infrastructure.usecases.employee;

import com.employeesolutions.employee_records_management.application.employee.usecases.DeleteEmployeeUseCase;
import com.employeesolutions.employee_records_management.domain.employee.ports.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEmployeeUseCaseImpl implements DeleteEmployeeUseCase {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DeleteEmployeeUseCaseImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void execute(Long employeeId) {
        // Check if the employee exists before deleting
        if (employeeRepository.existsById(employeeId)) {
            employeeRepository.deleteById(employeeId);
        } else {
            throw new RuntimeException("Employee not found with ID: " + employeeId);
        }
    }
}