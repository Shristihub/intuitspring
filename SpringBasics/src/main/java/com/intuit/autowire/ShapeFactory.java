package com.intuit.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

	// inject an object of IShape
	 @Autowired
	 // autowiring by type
	 @Qualifier("rectangle")
	 IShape shape; // by type same as shape= new Rectangle()

	 //autowiring by name - pass the bean name
	 @Autowired
	 IShape triangle; // same as shape= new Triangle()
	 
	 // autowiring by constructor
	 IShape shapeObj;
	 
	 @Autowired	 
	 public ShapeFactory(@Qualifier("square") IShape shapeObj) {
		super();
		this.shapeObj = shapeObj;
	}

	public void printArea(int x, int y) {
		 System.out.println("printing Area");
		 // shape points to rectangle object
		 shape.calcArea(x, y);
		 triangle.calcArea(x, y);
		 shapeObj.calcArea(20,80);
		 
	 }
}
