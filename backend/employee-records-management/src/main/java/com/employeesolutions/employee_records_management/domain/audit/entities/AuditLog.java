package com.employeesolutions.employee_records_management.domain.audit.entities;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Getter
public class AuditLog {
    private final Long id;
    private final String entityName;
    private final Long entityId;
    private final String action;
    private final String performedBy;
    private final String details; // JSON for old and new values
    private final Instant timestamp;

    @Builder
    private AuditLog(
            Long id,
            String entityName,
            Long entityId,
            String action,
            String performedBy,
            String details,
            Instant timestamp) {
        this.id = id;
        this.entityName = entityName;
        this.entityId = entityId;
        this.action = action;
        this.performedBy = performedBy;
        this.details = details;
        this.timestamp = timestamp;
        validate();
    }

    private void validate() {
        if (entityName == null || entityName.trim().isEmpty()) {
            throw new IllegalArgumentException("Entity name is required.");
        }
        if (action == null || action.trim().isEmpty()) {
            throw new IllegalArgumentException("Action is required.");
        }
    }
}
