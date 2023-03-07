package com.example.employeeRelationshipsLab.repositories;

import com.example.employeeRelationshipsLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
