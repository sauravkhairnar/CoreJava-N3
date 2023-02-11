//ThisKeywordDemo.java
package org.tnsif.thiskeyword;
//It can be used to refer instance variable of current class
class Account
{
	int a,b;
	void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void print()
	{
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);

	}
}

//driver class
public class ThisKeywordDemo {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setData(19, 60);
		a1.print();

	}

}