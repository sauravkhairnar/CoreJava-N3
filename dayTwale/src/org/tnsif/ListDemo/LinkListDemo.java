package org.tnsif.ListDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class LinkListDemo {
	public static void main(String[] args) {
		Collection obj1=new LinkedList<>();
		obj1.add(101);
		obj1.add(30.8f);
		obj1.add('z');
		System.out.println(obj1);
		System.out.println("First list is :"+obj1);	
		List<Object>obj2=new LinkedList<>();
		obj2.add(101);
		obj2.add(30.8f);
		obj2.add('z');
		obj2.addAll(obj2);
		obj2.add(30.8);
		System.out.println("Second list is :"+obj2);
		System.out.println("Size of list 1"+obj2.size());
		System.out.println("is list two is Empty ?"+obj2.isEmpty());
		obj2.remove(0);
		System.out.println("First list is :"+obj2);
		System.out.println(obj1.contains(101));
		System.out.println("Element at index 1:"+obj2.get(1));
		System.out.println("index of z:"+obj2.indexOf('z'));
		System.out.println("last index of 30.8f is :"+obj2.indexOf(30.8));
		obj2.clear();
		System.out.println(obj2);
		List<Integer>obj3=new LinkedList<>();
		obj3.add(67);
		obj3.add(16);
		obj3.add(45);
		System.out.println("list 3 is :" +obj3);
		// to sort it ascending wise
		Collections.sort(obj3);
		System.out.println("Ascending order :"+obj3);
	    Collections.reverse(obj3);
	    System.out.println("Dscending order :"+obj3);
	    
		}
}

		
		
		

