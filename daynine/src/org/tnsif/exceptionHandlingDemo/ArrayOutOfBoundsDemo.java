package org.tnsif.exceptionHandlingDemo;

public class ArrayOutOfBoundsDemo {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3};
		
		try {
			//System.exit(0); //this will stop program
			System.out.println(arr[3]);
		}
		catch (Exception e) {
			System.out.println("Exception hendled :"+ e);
			
		}
		finally {
			System.out.println("Finally block");
		}

	}

}