package com.intuit.autowire1;

import org.springframework.stereotype.Component;

@Component
public class Frontend implements ICourse{

	@Override
	public String[] showCourses() {
		return new String[] {"React","Html","Js"};
	}
	

}
