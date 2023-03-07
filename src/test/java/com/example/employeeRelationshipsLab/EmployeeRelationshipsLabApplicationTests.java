package com.example.employeeRelationshipsLab;

import com.example.employeeRelationshipsLab.models.Assignment;
import com.example.employeeRelationshipsLab.models.Department;
import com.example.employeeRelationshipsLab.models.Employee;
import com.example.employeeRelationshipsLab.models.Project;
import com.example.employeeRelationshipsLab.repositories.AssignmentRepository;
import com.example.employeeRelationshipsLab.repositories.DepartmentRepository;
import com.example.employeeRelationshipsLab.repositories.EmployeeRepository;
import com.example.employeeRelationshipsLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeRelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	AssignmentRepository assignmentRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAssignment() {
		Department hr = new Department("HR");
		Department it = new Department("IT");
		Employee helen = new Employee("Helen", "Smith", 1234, hr);
		Employee sarah = new Employee("Sarah", "Brown", 1235, it);
		Project java = new Project("Java Project", 15);
		Assignment assignment = new Assignment (helen, java);
		Assignment assignment2 = new Assignment(sarah, java);
		departmentRepository.save(hr);
		departmentRepository.save(it);
		employeeRepository.save(helen);
		employeeRepository.save(sarah);
		projectRepository.save(java);
		assignmentRepository.save(assignment);
		assignmentRepository.save(assignment2);

	}


}
