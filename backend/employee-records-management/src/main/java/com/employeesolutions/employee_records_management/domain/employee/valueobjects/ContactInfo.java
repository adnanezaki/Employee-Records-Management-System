package com.employeesolutions.employee_records_management.domain.employee.valueobjects;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ContactInfo {
    private final String phoneNumber;
    private final String email;

    @Builder
    public ContactInfo(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        validate();
    }

    private void validate() {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number is required.");
        }
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Valid email is required.");
        }
    }
}
