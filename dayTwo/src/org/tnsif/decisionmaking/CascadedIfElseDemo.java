//CascadedIfElseDemo java
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c)
			System.out.println("A is greater");
		else if(b>a && b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");

	}

}