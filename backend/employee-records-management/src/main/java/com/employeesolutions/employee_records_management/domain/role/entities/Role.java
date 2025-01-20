package com.employeesolutions.employee_records_management.domain.role.entities;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Role {
    private final Long id;
    private final String name;
    private final String permissionsConfig; // JSON for permission configurations

    @Builder
    private Role(Long id, String name, String permissionsConfig) {
        this.id = id;
        this.name = name;
        this.permissionsConfig = permissionsConfig;
        validate();
    }

    private void validate() {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Role name is required.");
        }
    }
}
