package com.databasedemo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databasedemo.app.dao.EmployeeRepo;
import com.databasedemo.app.dto.EmployeeDto;
import com.databasedemo.app.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public Employee addEmployee(EmployeeDto empDto) {
		Employee emp = new Employee(empDto);
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return empRepo.findById(id).get();
	}
}
