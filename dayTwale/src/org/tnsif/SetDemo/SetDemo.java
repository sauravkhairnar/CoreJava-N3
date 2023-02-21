package org.tnsif.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Object>obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("Naina");
		obj1.add(87.45f);
		System.out.println("Set 1 Element are:"+obj1);
		Set<Object>obj2=new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Naina");
		obj2.add(87.45f);
		System.out.println("Set 2 Element are:"+obj2);
		System.out.println(obj1.equals(obj2));
		
	}

}
