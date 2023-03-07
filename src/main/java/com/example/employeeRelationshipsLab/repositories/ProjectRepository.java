package com.example.employeeRelationshipsLab.repositories;

import com.example.employeeRelationshipsLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
