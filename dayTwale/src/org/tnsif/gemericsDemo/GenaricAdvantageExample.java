package org.tnsif.gemericsDemo;

import java.awt.List;
import java.util.ArrayList;

public class GenaricAdvantageExample {

	public static void main(String[] args) {
		ArrayList obj =new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println("Without Genaric:"+obj);
		// with generics
		ArrayList<Integer>obj2=new ArrayList<>();
		obj2.add("Met");
		String str=(String)obj2.get(0);
		System.out.println(str);
		ArrayList<String>obj3=new ArrayList<>();
		obj3.add("met");
		String str1=obj3.get(0);
		System.out.println(obj3);
		
		

	}

}
