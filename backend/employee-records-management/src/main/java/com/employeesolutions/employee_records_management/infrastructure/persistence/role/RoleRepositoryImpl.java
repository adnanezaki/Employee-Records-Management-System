package com.employeesolutions.employee_records_management.infrastructure.persistence.role;

import com.employeesolutions.employee_records_management.domain.role.entities.Role;
import com.employeesolutions.employee_records_management.domain.role.ports.RoleRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoryImpl extends JpaRepository<Role, Long>, RoleRepository {
}