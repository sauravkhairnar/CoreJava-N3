package org.tnsif.application;

import org.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		super.withdraw(accBal);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
	

}