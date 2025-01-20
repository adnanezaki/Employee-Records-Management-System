package com.employeesolutions.employee_records_management.infrastructure.persistence.role;

import com.employeesolutions.employee_records_management.domain.role.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}