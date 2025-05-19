package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.intuit.basics.Employee;

@SpringBootApplication
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

	@Autowired
	private Employee employee;
	
	
	@Override
	public void run(String... args) throws Exception {
		employee.printDetails();
		System.out.println(employee.getAddress());
	
	}

}
