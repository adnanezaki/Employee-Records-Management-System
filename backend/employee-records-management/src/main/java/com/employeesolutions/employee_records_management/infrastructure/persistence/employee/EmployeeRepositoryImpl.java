package com.employeesolutions.employee_records_management.infrastructure.persistence.employee;

import com.employeesolutions.employee_records_management.domain.employee.ports.EmployeeRepository;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositoryImpl extends JpaRepository<Employee, Long>, EmployeeRepository {
    @Override
    default List<Employee> findByFullNameContainingOrEmployeeIdContainingOrJobTitleContaining(
            String fullName, String employeeId, String jobTitle) {
        // Implement the custom query logic here
        return findByFullNameContainingOrEmployeeIdContainingOrJobTitleContaining(fullName, employeeId, jobTitle);
    }
}
