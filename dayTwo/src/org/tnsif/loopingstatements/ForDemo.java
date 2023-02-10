//ForDemo java
package org.tnsif.loopingstatements;

import java.util.Scanner;

//to demonstrate the example on "for loop"
public class ForDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		///to print 1 to N numbers
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//to print N to 1
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}

}