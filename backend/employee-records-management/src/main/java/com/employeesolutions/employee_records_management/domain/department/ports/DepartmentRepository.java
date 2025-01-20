package com.employeesolutions.employee_records_management.domain.department.ports;

import com.employeesolutions.employee_records_management.domain.department.entities.Department;

import java.util.List;
import java.util.Optional;
public interface DepartmentRepository {
    void save(Department department);
    Optional<Department> findById(Long id);
    List<Department> findAll();
}
