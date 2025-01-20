package com.employeesolutions.employee_records_management.domain.role.ports;
import com.employeesolutions.employee_records_management.domain.role.entities.Role;

import java.util.List;
import java.util.Optional;
public interface RoleRepository {
    void save(Role role);
    Optional<Role> findById(Long id);
    List<Role> findAll();
}
