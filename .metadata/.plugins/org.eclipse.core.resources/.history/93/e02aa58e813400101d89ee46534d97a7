package com.intuit.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {

	private String courseName;
	private double fees;
	private String type;
	public String getCourseName() {
		return courseName;
	}
	@Value("${student.course.name}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	@Value("${student.course.fees}")
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public String getType() {
		return type;
	}
	@Value("${student.course.type}")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fees=" + fees + ", type=" + type + "]";
	}
	
}
