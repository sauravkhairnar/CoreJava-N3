package org.tnsif.arraysdemo;

import java.util.Scanner;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student arr[];
		System.out.println("Enter no of elements: ");
		int n = s.nextInt();
		
		arr = new Student[n];
		
		System.out.println("Enter rollno | name | percentage");
		//it takes input separated by space
		
		for (int i = 0; i<n; i++) {
			
			arr[i]=new Student(s.nextInt(),s.next(),s.nextFloat());
		}
		
		System.out.println("Elements of array are ");
		
		for (int j=0; j<n; j++) {
			System.out.println(arr[j].getRollno() +" "+ arr[j].getName() +" "+ arr[j].getPercentage());
		}

	}

}