package org.tnsif.Framework;
public abstract class ShopFactory{
	public abstract PrimeAcc  getNewPrimeAcc(int accno,String accnm,float charges,boolean isPrime);
	public abstract NormalAcc getNewPrimeAcc(int accno,String accnm,float charges);
	
	

}
