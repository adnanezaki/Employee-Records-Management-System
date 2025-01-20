package com.employeesolutions.employee_records_management.domain.employee.entities;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Employee {
    private final Long id;
    private final String fullName;
    private final String employeeId;
    private final String jobTitle;
    private final String gender;
    private final Long departmentId;
    private final LocalDate hireDate;
    private final String employmentStatus;
    private final String contractType;
    private final String phoneNumber;
    private final String email;
    private final String address;
    private final String metadata; // JSON for additional employee details

    @Builder
    private Employee(
            Long id,
            String fullName,
            String employeeId,
            String jobTitle,
            String gender,
            Long departmentId,
            LocalDate hireDate,
            String employmentStatus,
            String contractType,
            String phoneNumber,
            String email,
            String address,
            String metadata) {
        this.id = id;
        this.fullName = fullName;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.departmentId = departmentId;
        this.hireDate = hireDate;
        this.employmentStatus = employmentStatus;
        this.contractType = contractType;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.metadata = metadata;
        validate();
    }

    private void validate() {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("Full name is required.");
        }
        if (employeeId == null || employeeId.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID is required.");
        }
        if (hireDate == null || hireDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Hire date must be in the past or present.");
        }
    }
}
