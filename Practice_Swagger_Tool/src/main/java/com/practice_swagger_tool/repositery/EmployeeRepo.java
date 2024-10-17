package com.practice_swagger_tool.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice_swagger_tool.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	

}
