package org.tnsif.usingrunnable;
public class Marathon {
	private int speed;
	private String city;
	public void run()
	
   
	{
		System.out.println("Speed of participent: " +speed + " the city is :" +city);
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
