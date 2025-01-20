package com.employeesolutions.employee_records_management.domain.employee.ports;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;

import java.util.List;
import java.util.Optional;
public interface EmployeeRepository {
    void save(Employee employee);
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
    void delete(Long id);
}
