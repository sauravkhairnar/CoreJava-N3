package org.tnsif.AssignmentFunctionRecursion;
import java.util.Scanner;

public class AdditionFunction {
	
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a = sc.nextInt();
		
		System.out.println("Enter b :");
		int b = sc.nextInt();
		
		System.out.println("Additiuon of a and b is : "+ add(a,b));

	}

}
Footer