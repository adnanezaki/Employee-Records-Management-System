package com.employeesolutions.employee_records_management.application.employee.mappers;

import com.employeesolutions.employee_records_management.application.employee.dtos.EmployeeDTO;
import com.employeesolutions.employee_records_management.domain.employee.entities.Employee;

import java.time.LocalDate;

public class EmployeeMapper {
    public static Employee toEntity(EmployeeDTO employeeDTO) {
        return Employee.builder()
                .id(employeeDTO.getId())
                .fullName(employeeDTO.getFullName())
                .employeeId(employeeDTO.getEmployeeId())
                .jobTitle(employeeDTO.getJobTitle())
                .gender(employeeDTO.getGender())
                .departmentId(employeeDTO.getDepartmentId())
                .hireDate(LocalDate.parse(employeeDTO.getHireDate()))
                .employmentStatus(employeeDTO.getEmploymentStatus())
                .contractType(employeeDTO.getContractType())
                .phoneNumber(employeeDTO.getPhoneNumber())
                .email(employeeDTO.getEmail())
                .address(employeeDTO.getAddress())
                .metadata(employeeDTO.getMetadata())
                .build();
    }

    public static EmployeeDTO toDTO(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .fullName(employee.getFullName())
                .employeeId(employee.getEmployeeId())
                .jobTitle(employee.getJobTitle())
                .gender(employee.getGender())
                .departmentId(employee.getDepartmentId())
                .hireDate(employee.getHireDate().toString())
                .employmentStatus(employee.getEmploymentStatus())
                .contractType(employee.getContractType())
                .phoneNumber(employee.getPhoneNumber())
                .email(employee.getEmail())
                .address(employee.getAddress())
                .metadata(employee.getMetadata())
                .build();
    }
}