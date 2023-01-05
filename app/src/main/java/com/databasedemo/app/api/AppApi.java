package com.databasedemo.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.databasedemo.app.dao.EmployeeRepo;
import com.databasedemo.app.dto.EmployeeDto;
import com.databasedemo.app.entity.Employee;
import com.databasedemo.app.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class AppApi {
 @Autowired
 EmployeeService empService;
 
 @PostMapping("/employees")
 public Employee addEmployee(@RequestBody EmployeeDto emp) {
	 return empService.addEmployee(emp);
 }
 
 @GetMapping("/employees")
 public List<Employee> getAllEmployees() {
	 return empService.getAllEmployees();
 }
 
 @GetMapping("/employees/{id}")
 public Employee getEmployeeById(@PathVariable int id) {
	 return empService.getEmployeeById(id);
 }
}
