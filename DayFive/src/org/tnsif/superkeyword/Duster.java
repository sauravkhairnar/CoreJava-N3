//Duster.java
package org.tnsif.superkeyword;

public class Duster extends Renault {
	private int speed=120;
	public void print()
	{
		//it will call to parent class method
		super.print();
		System.out.println("The speed of Duster is: "+speed+"km/hr");
	}
	
	
}