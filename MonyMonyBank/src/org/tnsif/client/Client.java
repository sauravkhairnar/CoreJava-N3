package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory f = new MMBankFactory();
		MMSavingAcc s = new MMSavingAcc(123, "joe", 20000.0f, true);
		MMCurrentAcc c = new MMCurrentAcc(234, "ben", 25000.0f, 40000.0f);
		
		System.out.println("Savings Account:");
		System.out.println(s);
		s.withdraw(4500); 		//withdraws 4500 from accBalance
		
		System.out.println();
		
		System.out.println("Current Account:");
		System.out.println(c);
		s.withdraw(5000);		//withdraws 4500 from accBalance
		
		
		
		 
		f.getNewSavingAcc(456, "sam", 45000.0f, true);
		f.getNewCurrentAcc(552, "karl", 50000.0f, 80000.0f);
		

	}

}