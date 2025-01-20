package com.employeesolutions.employee_records_management.domain.audit.ports;
import com.employeesolutions.employee_records_management.domain.audit.entities.AuditLog;

import java.util.List;
public interface AuditLogRepository {
    void save(AuditLog auditLog);
    List<AuditLog> findByEntityId(Long entityId);
}
