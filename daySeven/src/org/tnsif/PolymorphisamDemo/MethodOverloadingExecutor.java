package org.tnsif.PolymorphisamDemo;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Resoultion and slotype"+"of cellfone");
	 int resolution=s.nextInt();
	 s.nextLine();
	 String slottype=s.nextLine();
	 Smartfone sp=new Smartfone();
	 sp.setResolution(resolution);
	 sp.setSlottype(slottype);
	 sp.display(resolution);
	 sp.display(resolution, slottype);
	 multiplication m=new multiplication();
	 System.out.println("multiplication of overloading"+s.);
	  
	 

	}

}
