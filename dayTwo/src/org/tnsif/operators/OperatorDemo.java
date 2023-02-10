//OperatorDemo java
package org.tnsif.operators;

//to demonstrate the example on types of operators
import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter the value of x and y");
		int x=s.nextInt();
		//int y=s.nextInt();
		//Arithmetic operators
		/*System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);*/
		
		//relational operator
		/*boolean res=x>y;
		System.out.println(res);*/
		
		//Assignment operator
		/*
		 x*=y;//x=x*y
		System.out.println(x);*/
		
		//logical operator
		/*boolean res2= (5==5)&&(5>3); //true
		boolean res3= (5==3)||(5>2); //true
		boolean res4= !(5==4);//true
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		*/
		//bitwise
		/*int a=12 & 5;
		int b=12 | 5;
		int c= 12^ 5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		//Ternary operator
		/*String res=(13%2==0)?"Even":"Odd";
		System.out.println(res);*/
		
		//Increment and decrement
		int p= x++;//5
		int q= --x; //5
		System.out.println(q);

	}

}
