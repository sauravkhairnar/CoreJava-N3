//Iphone.java
package org.tnsif.multilevelinheritance;

//child class2
public class Iphone extends Android{
	//private data members
	private String slottype;
	public void slot()
	{
		System.out.println("Slotype is: "+slottype);
	}
	//getters and setters
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone() {
		super();
		
	}
	public Iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
	

}