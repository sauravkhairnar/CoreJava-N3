package org.tnsif.abstractionDemo;
public abstract class Menu {
	// to demonstrate the abstract class and abstract method
	// astract class 
	// class can not be final abstract
	abstract void recipe();
	abstract void foodType();
	
	// non abstract method concreat method
	 void menuType()
	 {
		 System.out.println("Veg and Nonveg");
	 }
	

}
