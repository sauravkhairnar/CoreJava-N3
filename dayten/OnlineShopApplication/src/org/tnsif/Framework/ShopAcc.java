package org.tnsif.Framework;

public abstract class ShopAcc {
	private int accno;
	private String accnm;
	private float charges;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public ShopAcc(int accno, String accnm, float charges) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accnm=" + accnm + ", charges=" + charges + "]";
	}
	abstract public void bookProduct();
	public void items(float charges)
	{
		System.out.println(charges);
		
	}
	
	

}
