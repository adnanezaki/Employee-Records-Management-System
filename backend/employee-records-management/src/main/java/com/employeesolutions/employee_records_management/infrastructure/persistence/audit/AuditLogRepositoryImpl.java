package com.employeesolutions.employee_records_management.infrastructure.persistence.audit;

import com.employeesolutions.employee_records_management.domain.audit.entities.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
    List<AuditLog> findByEntityId(Long entityId); // Custom query
}