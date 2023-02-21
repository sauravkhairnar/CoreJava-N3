package org.tnsif.ListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {
		Collection obj=new ArrayList<>();
		obj.add(101);
		obj.add(30.8f);
		obj.add('z');
		
		System.out.println(obj);
		System.out.println("First list is :"+obj);	
	List<Object>obj1=new ArrayList<>();
//	obj.add(101);
//	obj.add(30.8f);
//	obj.add('z');
	obj1.addAll(obj);
	obj1.add(30.8);
	
	System.out.println("Second list is :"+obj1);
	System.out.println("Size of list 1"+obj.size());
	System.out.println("is list two is Empty ?"+obj1.isEmpty());
	obj.remove(101);
	System.out.println("First list is :"+obj);
	System.out.println(obj1.contains(101));
	System.out.println("Element at index 1:"+obj1.get(1));
	System.out.println("index of z:"+obj1.indexOf('z'));
	System.out.println("last index of 30.8f is :"+obj1.indexOf(30.8));
	obj.clear();
	System.out.println(obj);
	List<Integer>obj2=new ArrayList<>();
	obj2.add(67);
	obj2.add(16);
	obj2.add(45);
	System.out.println("list 3 is :" +obj2);
	// to sort it ascending wise
	Collections.sort(obj2);
	System.out.println("Ascending order :"+obj2);
    Collections.reverse(obj2);
    System.out.println("Dscending order :"+obj2);
    
	}
}
