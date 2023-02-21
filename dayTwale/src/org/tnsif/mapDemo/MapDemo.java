package org.tnsif.mapDemo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();
		obj.put(411001,"MG Road"); 
		obj.put(411001,"Mg Road");
		System.out.println(obj);
	Map<Integer,String>obj1=new LinkedHashMap<>();
	    obj1.put(411001, "MG Road");
	    obj1.put(411001, "Mg Road");
	    System.out.println(obj1);
	}
}
