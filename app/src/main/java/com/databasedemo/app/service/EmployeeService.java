package com.databasedemo.app.service;

import java.util.List;

import com.databasedemo.app.dto.EmployeeDto;
import com.databasedemo.app.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(EmployeeDto emp);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

}
