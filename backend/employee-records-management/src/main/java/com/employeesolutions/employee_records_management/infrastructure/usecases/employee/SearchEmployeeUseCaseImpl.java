package com.employeesolutions.employee_records_management.infrastructure.usecases.employee;

import com.employeesolutions.employee_records_management.application.employee.usecases.SearchEmployeeUseCase;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;
import com.employeesolutions.employee_records_management.domain.employee.ports.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchEmployeeUseCaseImpl implements SearchEmployeeUseCase {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public SearchEmployeeUseCaseImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> execute(String searchQuery) {
        // Use the repository to search for employees by name, ID, or job title
        return employeeRepository.findByFullNameContainingOrEmployeeIdContainingOrJobTitleContaining(
                searchQuery, searchQuery, searchQuery);
    }
}