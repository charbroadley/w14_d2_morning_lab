package com.example.employeeRelationshipsLab.repositories;

import com.example.employeeRelationshipsLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
