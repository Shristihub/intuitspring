package com.intuit.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:application.properties")
public class Employee {

	private String empName;
	private double salary;
	
	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	@Value("${employee.name}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	@Value("${employee.salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void printDetails() {
		System.out.println("Emp Name "+empName);
		System.out.println("Salary "+salary);
		System.out.println("Address "+address);
	}
}
