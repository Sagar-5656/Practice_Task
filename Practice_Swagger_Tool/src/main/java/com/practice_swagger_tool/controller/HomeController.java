package com.practice_swagger_tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/alldata")
	public List<Employee> getAllEmployee(){
		
		System.out.println("Sagar have added Post method");
		List<Employee> list =esi.gellAllEmployee();
		return list;
	}
	
	@GetMapping("/getsingle/{id}")
	public Employee getSingleData(@PathVariable int id) {
		
		System.out.println("Sagar have added Post method");
		Employee ee = esi.getSingle(id);
		return ee;
	}
}
