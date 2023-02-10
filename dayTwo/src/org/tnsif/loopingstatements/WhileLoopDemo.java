//WhileLoopDemo.java
package org.tnsif.loopingstatements;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		///to print 1 to N numbers
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
		}

	}

}