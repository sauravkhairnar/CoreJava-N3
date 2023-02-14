package org.tnsif.exceptionHandlingDemo;

public class ThrowDemo {
	//using throws keyword
	public static void donate(int age,int weight) throws Exception {
		
		if (age>18 && age<50) {
			System.out.println("Eligible for Blood donation");
		}
		
		else {
			//write exception type to throw with message
			throw new ArithmeticException("Not Eligible");
		}
	}

	public static void main(String[] args) {
		
		try {
			donate(18,55);
		} 
		catch (Exception e) {
			System.out.println("Exception Handled: "+ e);
		}
		
		

	}

}
