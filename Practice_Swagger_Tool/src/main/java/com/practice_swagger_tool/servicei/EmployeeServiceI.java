package com.practice_swagger_tool.servicei;

import java.util.List;

import com.practice_swagger_tool.model.Employee;

public interface EmployeeServiceI {

	public Employee saveEmployee(Employee e);

	public List<Employee> gellAllEmployee();

	public Employee getSingle(int id);

}
