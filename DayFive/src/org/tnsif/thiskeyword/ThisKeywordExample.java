//ThisKeywordExample.java
package org.tnsif.thiskeyword;
//this can be passed as argument in the constructor call
class Finance
{
	int salary;

	public Finance() {
		System.out.println("Parent class");
	}

	public Finance(int salary) {
		this.salary=salary;
	}
	void print()
	{
		System.out.println("Salary is: "+salary);
	}
	
}
//driver class
public class ThisKeywordExample {

	public static void main(String[] args) {
		Finance f=new Finance();
		Finance f1=new Finance(86000);
		f1.print();


	}

}