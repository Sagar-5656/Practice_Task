package com.practice_swagger_tool.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice_swagger_tool.model.Employee;
import com.practice_swagger_tool.repositery.EmployeeRepo;
import com.practice_swagger_tool.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	
	@Autowired
	EmployeeRepo er;

	@Override
	public Employee saveEmployee(Employee e) {
		Employee ee = er.save(e);
		return ee;
	}

}
