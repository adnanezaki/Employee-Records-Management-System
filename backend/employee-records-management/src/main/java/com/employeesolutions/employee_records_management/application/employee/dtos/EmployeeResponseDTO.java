package com.employeesolutions.employee_records_management.application.employee.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeResponseDTO {
    private Long id;
    private String fullName;
    private String employeeId;
    private String jobTitle;
    private String gender;
    private Long departmentId;
    private String hireDate;
    private String employmentStatus;
    private String contractType;
    private String phoneNumber;
    private String email;
    private String address;
    private String metadata;
}