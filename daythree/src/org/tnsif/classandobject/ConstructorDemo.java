//ConstructorDemo java
package org.tnsif.classandobject;

import java.util.Scanner;

//driver class
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=1;
		while(n<=2)
		{
		System.out.println("Enter the id,name and city");
		int id;
		String custname,city;
		
		id=s.nextInt();
		s.nextLine();
		
		custname=s.nextLine();
		city=s.nextLine();
		
		// for cust1
		Customer c=new Customer();
		c.setId(id);
		c.setCustname(custname);
		c.setCity(city);
		//c.display();
		System.out.println(c.getId());
		System.out.println(c.getCustname());
		System.out.println(c.getCity());
		n++;
		
		}
	}
		
		/*//cust2
		System.out.println("Enter the id,name and city");
		int id1;
		String custname1,city1;
		
		id1=s.nextInt();
		s.nextLine();
		
		custname1=s.nextLine();
		city1=s.nextLine();
		
		// for cust1
		Customer c1=new Customer(id1,custname1,city1);
		//c1.setId(id1);
		//c1.setCustname(custname1);
		//c1.setCity(city1);
		//c1.display();
		System.out.println(c1.getId());
		System.out.println(c1.getCustname());
		System.out.println(c1.getCity());*/


}

