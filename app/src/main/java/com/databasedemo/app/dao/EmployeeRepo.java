package com.databasedemo.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databasedemo.app.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	
}
