package org.tnsif.PolymorphisamDemo;
public class HondaCity {
	private int speed;
	private String color;
	
	
	//geterr
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public HondaCity() {
	System.out.println("i like the drive the hondacity car");
	}
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("speed is:"+speed+","+"color is:"+color);
	}
		
		
	

}
