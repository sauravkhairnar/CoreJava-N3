package org.tnsif.exceptionHandlingDemo;
public class ArrayExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] myIntArray = new int[] {1,2,3};
		
		try {
		print(myIntArray);
	}
		
		catch (Exception e) {
		System.out.println("Exception handled using catch: "+ e);
	}
		
		System.out.println("Third Line");
		
	}
	
		public static void print(int[] arr) {
			System.out.println(arr[3]);
	}

}
