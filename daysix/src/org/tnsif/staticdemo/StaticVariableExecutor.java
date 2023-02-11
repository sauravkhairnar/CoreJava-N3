//StaticVariableExecutor.java
package org.tnsif.staticdemo;
//program to demonstrate on static variable
//driver class
public class StaticVariableExecutor {

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable("Nia Lopez");
		System.out.println(s);
		//use classname.varname to print static variable
		System.out.println(StaticVariable.companyName);

	}

}