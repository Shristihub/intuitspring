package com.intuit.autowire1;

import org.springframework.stereotype.Component;

@Component
public class Backend implements ICourse{

	@Override
	public String[] showCourses() {
		return new String[] {"Java","Spring","Microservices"};
	}
	

}
