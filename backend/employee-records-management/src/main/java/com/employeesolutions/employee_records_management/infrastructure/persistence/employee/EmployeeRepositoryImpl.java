package com.employeesolutions.employee_records_management.infrastructure.persistence.employee;

import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFullNameContainingOrEmployeeIdContainingOrJobTitleContaining(
            String fullName, String employeeId, String jobTitle);
}