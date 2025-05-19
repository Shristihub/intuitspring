package com.intuit.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Restaurant {

//	@Autowired
//	@Qualifier("getIndian")
	private ICuisine cuisine;
	
	public void setCuisine(ICuisine cuisine) {
		this.cuisine = cuisine;
	}

	public void printMenus() {
		System.out.println("Menus of different cuisines");
		cuisine.showMenus();
	}
}
