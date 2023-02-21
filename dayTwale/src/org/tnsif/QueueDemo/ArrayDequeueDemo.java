package org.tnsif.QueueDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		Deque<String>obj=new ArrayDeque<>();
		obj.add("Vaibhav");
		obj.addFirst("Vrush");
		obj.addLast("Saurav");
		System.out.println("Array Deque Element:"+obj);
		for(String itr:obj)
		{
			System.out.println(itr+"");
		}
		
		obj.remove();
		System.out.println("Array Deque Element:"+obj);
		obj.removeFirst();
		System.out.println("Array Deque Element:"+obj);
		obj.removeLast();
		System.out.println("Array Deque Element:"+obj);
				
	}

}
