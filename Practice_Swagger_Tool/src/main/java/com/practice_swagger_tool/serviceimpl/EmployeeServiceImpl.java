package com.practice_swagger_tool.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	
	@Override
	public List<Employee> gellAllEmployee() {
		List<Employee> list = er.findAll();
		return list;
	}

	@Override
	public Employee getSingle(int id) {
		Optional<Employee> op = er.findById(id);
		if (op.isPresent()) {
			Employee ee = op.get();
			return ee;
		}else {
		 	throw new RuntimeException("Employee not Available");
		}
		
	}

}
