//InstanceOfDemo.java
package org.tnsif.instanceofdemo;
//driver class
import java.util.Scanner;

public class InstanceOfDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name,address and age:");
		String name=s.nextLine();
		String address=s.nextLine();
		int age=s.nextInt();
		
		//object creation
		Child c=new Child();
		Child c1=new Child(name,address,age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		System.out.println(c1);
		System.out.println(c instanceof Person);
		System.out.println(c1 instanceof Child);

	}

}