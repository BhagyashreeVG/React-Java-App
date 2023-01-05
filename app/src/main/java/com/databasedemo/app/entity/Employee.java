package com.databasedemo.app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.databasedemo.app.dto.EmployeeDto;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String firstName;
	public String secondName;
	public String address;
	public String dept;
	public Double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String secondName, String address, String dept, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", address=" + address
				+ ", dept=" + dept + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, dept, firstName, id, salary, secondName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(dept, other.dept)
				&& Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(salary, other.salary)
				&& Objects.equals(secondName, other.secondName);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Employee(EmployeeDto dto) {
		this.firstName = dto.firstName;
		this.secondName = dto.secondName;
		this.address = dto.address;
		this.dept = dto.dept;
		this.salary = dto.salary;
	}
}
