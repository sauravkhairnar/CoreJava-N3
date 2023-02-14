package org.tnsif.arraysdemo;

public class ArrayProgram {

	public static void main(String[] args) {
		//array
		int arr1[] = {11,65,45,12,32};
		int arr2[] = new int[3];
		//compile time input
		arr2[0]= 4;
		arr2[1]= 5;
		arr2[2]= 6;
		//arr2[3]= 7; this will give error
		System.out.println(arr1[2]);
		System.out.println(arr2[1]);

	}

}
