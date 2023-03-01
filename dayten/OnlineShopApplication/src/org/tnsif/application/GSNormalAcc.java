package org.tnsif.application;

import org.tnsif.Framework.NormalAcc;

public abstract class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accnm, float charges ,float dileveryCharges)
	{
		super(accno, accnm, charges,dileveryCharges);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	

	
	

}
