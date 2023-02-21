package org.tnsif.SetDemo;
public class Student {
    private int rollno;
    private String name;
    private float percentage;
    // using parameterized constructor
	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() 
	{
		return "Student [getRollno()=" + getRollno() + ", getName()=" + getName() + ", getPercentage()="
				+ getPercentage() + "]";
	}
}
