//StaticBlock.java
package org.tnsif.staticdemo;
//program to demonstrate on static block
public class StaticBlock {
	
	//non-static variable
	private int num;
	//static variable
	private static String name;
	
	
	//getters and setters
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}

	//static block
	/*static block is used to initialise static variable*/
	static
	{
		name="Ganesh";
	}

	
}