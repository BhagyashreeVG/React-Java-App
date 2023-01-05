package com.databasedemo.app.dto;

import java.util.Objects;

public class EmployeeDto {
	public String firstName;
	public String secondName;
	public String address;
	public String dept;
	public Double salary;
	
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDto(String firstName, String secondName, String address, String dept, Double salary) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDto [firstName=" + firstName + ", secondName=" + secondName + ", address=" + address + ", dept="
				+ dept + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, dept, firstName, salary, secondName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDto other = (EmployeeDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(dept, other.dept)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(salary, other.salary)
				&& Objects.equals(secondName, other.secondName);
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
	
}
