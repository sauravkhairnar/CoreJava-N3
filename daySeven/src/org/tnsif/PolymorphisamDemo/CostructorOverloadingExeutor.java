package org.tnsif.PolymorphisamDemo;
import java.util.Scanner;
public class CostructorOverloadingExeutor {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the speed and color of  hondacity:");
		int speed=s.nextInt();
		s.nextLine();
		String color=s.nextLine();
		HondaCity c=new HondaCity();
		HondaCity c1=new HondaCity(speed,color);
	
	}

}
