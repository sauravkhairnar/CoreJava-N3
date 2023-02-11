//Student.java
package org.tnsif.singlelevelinheritance;

//child class
public class Student extends Citizen{
	
	//private data members
	private int rollno;
	private String studname;
	
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public Student() {
		super();
	}
	
	
	public Student(String name,String adharno,String city,long mbno,int rollno, String studname) {
		super(name,adharno,city,mbno);
		
		this.rollno = rollno;
		this.studname = studname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
				+ ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
	
	
	
	
	
	
	

}