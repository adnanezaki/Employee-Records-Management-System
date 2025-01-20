package com.employeesolutions.employee_records_management.application.employee.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Full name is required")
    private String fullName;

    @NotBlank(message = "Employee ID is required")
    private String employeeId;

    @NotBlank(message = "Job title is required")
    private String jobTitle;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Department ID is required")
    private Long departmentId;

    @NotBlank(message = "Hire date is required")
    private String hireDate;

    @NotBlank(message = "Employment status is required")
    private String employmentStatus;

    @NotBlank(message = "Contract type is required")
    private String contractType;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^(\\+\\d{1,3}\\s?)?\\d{10}$", message = "Invalid phone number format")
    private String phoneNumber;

    @NotBlank(message = "Email is required")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    private String metadata;
}