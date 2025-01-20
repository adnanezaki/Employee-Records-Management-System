package com.employeesolutions.employee_records_management.application.employee.services;

import com.employeesolutions.employee_records_management.application.employee.dtos.EmployeeDTO;
import com.employeesolutions.employee_records_management.application.employee.mappers.EmployeeMapper;
import com.employeesolutions.employee_records_management.application.employee.usecases.AddEmployeeUseCase;
import com.employeesolutions.employee_records_management.application.employee.usecases.DeleteEmployeeUseCase;
import com.employeesolutions.employee_records_management.application.employee.usecases.UpdateEmployeeUseCase;
import com.employeesolutions.employee_records_management.application.employee.usecases.SearchEmployeeUseCase;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final AddEmployeeUseCase addEmployeeUseCase;
    private final UpdateEmployeeUseCase updateEmployeeUseCase;
    private final DeleteEmployeeUseCase deleteEmployeeUseCase;
    private final SearchEmployeeUseCase searchEmployeeUseCase;

    @Autowired
    public EmployeeServiceImpl(
            AddEmployeeUseCase addEmployeeUseCase,
            UpdateEmployeeUseCase updateEmployeeUseCase,
            DeleteEmployeeUseCase deleteEmployeeUseCase,
            SearchEmployeeUseCase searchEmployeeUseCase) {
        this.addEmployeeUseCase = addEmployeeUseCase;
        this.updateEmployeeUseCase = updateEmployeeUseCase;
        this.deleteEmployeeUseCase = deleteEmployeeUseCase;
        this.searchEmployeeUseCase = searchEmployeeUseCase;
    }

    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.toEntity(employeeDTO);
        addEmployeeUseCase.execute(employee);
    }

    @Override
    public void updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.toEntity(employeeDTO);
        updateEmployeeUseCase.execute(employee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        deleteEmployeeUseCase.execute(employeeId);
    }

    @Override
    public List<EmployeeDTO> searchEmployees(String searchQuery) {
        List<Employee> employees = searchEmployeeUseCase.execute(searchQuery);
        return employees.stream()
                .map(EmployeeMapper::toDTO)
                .toList();
    }
}