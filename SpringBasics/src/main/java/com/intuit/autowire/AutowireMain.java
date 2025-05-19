package com.intuit.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intuit.basics.Employee;

public class AutowireMain {

	public static void main(String[] args) {
		
		// create the IoC Container
		ApplicationContext context = new AnnotationConfigApplicationContext("com.intuit");
		ShapeFactory factory = context.getBean("shapeFactory",ShapeFactory.class);
		//call the method
		factory.printArea(10, 20);
		
		
	
	}

}
