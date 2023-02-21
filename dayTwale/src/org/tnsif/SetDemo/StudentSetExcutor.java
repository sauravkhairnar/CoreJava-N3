package org.tnsif.SetDemo;
import java.util.LinkedHashSet;
import java.util.Set;
public class StudentSetExcutor {
	// user defined method 
	public static  void addStudent(Set<Student>obj1)
	{
 
		 Student st1=new Student(101,"vaibhav",90.45f);
		 Student st2=new Student(102,"Saurav",35.00f);
		 Student st3=new Student(103,"Vrush",40.00f);
		 Student st4=new Student(104,"Rohan",50.00f);
		 obj1.add(st1);
		 obj1.add(st2);
		 obj1.add(st3);
		 obj1.add(st4);
		
	}
	
	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<Student>();
		addStudent(obj);
		System.out.println(obj);
			

	}

}
