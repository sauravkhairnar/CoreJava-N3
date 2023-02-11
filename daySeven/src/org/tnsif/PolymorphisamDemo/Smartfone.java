package org.tnsif.PolymorphisamDemo;
// programme to demonstrate on method overloading
public class Smartfone {
	private int resolution;
	private String slottype;
	void display(int resolution)
	{
	   System.out.println("Camera Resoultion:"+resolution);
	}
	void display(int resoultion,String slottype)
	{
		System.out.println("Camera Reoultion:"+resolution","slottype:"+slottype");
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	

}
