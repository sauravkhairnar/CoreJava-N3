package org.tnsif.exceptionHandlingDemo;

public class NestedTryCatchBlockDemo {
	
public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		int arr[] = new int[] {1,2,3};
		
		
		try { 
			System.out.println(x/y);
			
			try {
				System.out.println(arr[3]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Exception handled :"+ e);
				
			}		
		}
		
		catch (ArithmeticException a)  {
			
			System.out.println("Arithmetic Exception handled :"+ a);
			
			try {
				System.out.println(arr[3]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Exception handled :"+ e);
				
			}
		}
		
		
		
		
		finally {
			System.out.println("Finally block");
		}

	}

}