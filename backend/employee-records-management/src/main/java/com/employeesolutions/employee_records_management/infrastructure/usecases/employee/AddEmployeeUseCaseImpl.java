package com.employeesolutions.employee_records_management.infrastructure.usecases.employee;

import com.employeesolutions.employee_records_management.application.employee.usecases.AddEmployeeUseCase;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;
import com.employeesolutions.employee_records_management.domain.employee.ports.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEmployeeUseCaseImpl implements AddEmployeeUseCase {
    private final EmployeeRepository employeeRepository;
    public AddEmployeeUseCaseImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void execute(Employee employee) {
        employeeRepository.save(employee);
    }
}