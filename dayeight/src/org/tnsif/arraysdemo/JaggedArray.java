package org.tnsif.arraysdemo;

import java.util.Scanner;

public class JaggedArray {
//jagged array is inside array has different lengths
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//main array
		int arr[][] = new int[2][];
		//first array has 3 columns /inside array
		arr[0] = new int[3];
		//second array has 2 columns /inside array
		arr[1] = new int[2];
		
		System.out.println("Enter the array elements: ");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
