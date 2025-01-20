package com.employeesolutions.employee_records_management.infrastructure.persistence.department;

import com.employeesolutions.employee_records_management.domain.department.entities.Department;
import com.employeesolutions.employee_records_management.domain.department.ports.DepartmentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryImpl extends JpaRepository<Department, Long>, DepartmentRepository {
}