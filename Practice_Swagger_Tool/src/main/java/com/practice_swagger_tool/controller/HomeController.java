package com.practice_swagger_tool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice_swagger_tool.model.Employee;
import com.practice_swagger_tool.servicei.EmployeeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	EmployeeServiceI esi;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee e) {
		
		System.out.println("Ishwar have added Post method");
		Employee ee =esi.saveEmployee(e);
		return ee;
	}

}
