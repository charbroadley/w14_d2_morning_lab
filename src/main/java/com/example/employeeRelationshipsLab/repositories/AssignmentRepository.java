package com.example.employeeRelationshipsLab.repositories;

import com.example.employeeRelationshipsLab.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
