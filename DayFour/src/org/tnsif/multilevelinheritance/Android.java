//Android.java
package org.tnsif.multilevelinheritance;

//child class 1 and parent class2
public class Android extends Nokia{
	
	private String version;
	public void accept()
	{
		System.out.println("The android version name is: "+version);
	}
	//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Android() {
		super();
		
	}
	public Android(String version) {
		super();
		this.version = version;
	}
	
	
	
	
	

}