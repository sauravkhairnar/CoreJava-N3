package org.tnsif.Framework;
public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float dileveryCharges=0.0f;
	public PrimeAcc(int accno, String accnm, float charges, boolean isPrime)
	
	{
		super(accno, accnm, charges);
		this.isPrime=isPrime;		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Acc No"+this.getAccnm()+""+"Acc Name:"+this.getAccnm()+""+"dilevery charges:"+this.getCharges()+this.dileveryCharges);
	}
	@Override
	public String toString() 
	{
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
	

}
