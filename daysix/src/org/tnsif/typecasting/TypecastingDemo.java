package org.tnsif.typecasting;

public class TypecastingDemo {

	public static void main(String[] args)
	{
      // implicit typecasting 
		int x=15;
		float y=x;
		
		System.out.println("the value of y is: "+y);
		// explicit typecassting
		double d=12.5;
		long l=(long)d;
		System.out.println("the value of l is :"+l);
		//
		byte p=12;
		int q=p;
		System.out.println("the value of q is" +q);
		
		
	}

}
