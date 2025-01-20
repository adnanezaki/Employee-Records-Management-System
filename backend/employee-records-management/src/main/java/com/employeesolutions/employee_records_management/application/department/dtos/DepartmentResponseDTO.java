package com.employeesolutions.employee_records_management.application.department.dtos;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class DepartmentResponseDTO {
    private Long id;
    private String name;
    private Long managerId;
}
