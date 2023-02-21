package org.tnsif.ListDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
       Stack<String>obj=new Stack<>();
       obj.push("Shital");
       obj.push("Pratik");
       obj.push("Bhushan");
       obj.push("Gauri");
       System.out.println("this element inside the stack:"+"are:"+obj);
       obj.pop();
       System.out.println("This Element inside the stack:+are:"+obj);
       obj.pop();
       

	}

}
