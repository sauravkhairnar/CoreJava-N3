package org.tnsif.Framework;
public abstract class NormalAcc extends ShopAcc{

	final private float dileveryCharges;
	public NormalAcc(int accno, String accnm, float charges, float dileveryCharges)
	{
		super(accno, accnm, charges);
		this.dileveryCharges=dileveryCharges;
			
	}
	@Override
	public String toString() {
		return "NormalAcc [dileveryCharges=" + dileveryCharges + ", toString()=" + super.toString() + "]";
	}
	public void bookProduct(float charges) 
	{

		System.out.println("Acc No: "+this.getAccno()+" "+"Acc name:"+this.getAccnm()+"DeliveryCharges:"+this.dileveryCharges);
	}
	
	
	

}
