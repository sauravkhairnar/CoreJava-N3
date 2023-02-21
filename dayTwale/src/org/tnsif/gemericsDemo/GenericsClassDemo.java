package org.tnsif.gemericsDemo;
public class GenericsClassDemo<T> {
	T x;
	void display(T x)
	{
	   this.x=x;
	   
    }
	T accept()
	{
		return x;
		
	}

	public static void main(String[] args) {
		GenericsClassDemo<String>obj1=new GenericsClassDemo<String>();
		obj1.display("TechnoServe India");
		System.out.println(obj1.accept());
//		obj1.display(11);
		obj1.display("Tns Foundation india");
		System.out.println(obj1.accept());
	}

}
