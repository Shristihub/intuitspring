package com.intuit.autowire1;

import org.springframework.stereotype.Component;

@Component
public class Cloud implements ICourse{

	@Override
	public String[] showCourses() {
		return new String[] {"AWS","Azure","GCP"};
	}
	

}
