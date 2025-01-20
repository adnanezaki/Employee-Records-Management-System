package com.employeesolutions.employee_records_management.application.role.dtos;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDTO {
    private Long id;
    private String name;
    private String permissionsConfig; // JSON for permission configurations
}
