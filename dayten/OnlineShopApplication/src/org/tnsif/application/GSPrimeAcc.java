package org.tnsif.application;
import org.tnsif.Framework.PrimeAcc;
public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accno, String accnm, float charges ,boolean isPrime) 
	{
		super(accno, accnm, charges, isPrime);
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}

	@Override
	public void bookProduct() {
		// TODO Auto-generated method stub
		
	}
	
}

