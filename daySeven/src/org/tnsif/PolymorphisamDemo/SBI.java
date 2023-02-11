package org.tnsif.PolymorphisamDemo;

public class SBI extends RBI {
	// child class 
	float getInterest()
	{
		super.getInterest();
		System.out.println(super.getInterest());
		return 12.8f;
		
	}
	

}
