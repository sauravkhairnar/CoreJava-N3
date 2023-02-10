//SwitchDemo.java
package org.tnsif.decisionmaking;
//program on switch case
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song number");
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Kesariya");
			
		case 2:
			System.out.println("Ved");
			break;
		case 3:
			System.out.println("Calm down");
			break;
		default:	
			System.out.println("Invalid Input");
		}

	}

}