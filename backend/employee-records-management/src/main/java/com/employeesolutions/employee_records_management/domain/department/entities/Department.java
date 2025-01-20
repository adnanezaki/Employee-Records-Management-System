package com.employeesolutions.employee_records_management.domain.department.entities;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Department {
    private final Long id;
    private final String name;
    private final Long managerId; // Reference to Employee ID

    @Builder
    private Department(Long id, String name, Long managerId) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
        validate();
    }

    private void validate() {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name is required.");
        }
    }
}
