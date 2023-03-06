package org.tnsif.client;
import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory f = new MMBankFactory();
		MMSavingAcc s = new MMSavingAcc(123, "Harshada", 1000.0f, true);
		MMCurrentAcc c = new MMCurrentAcc(234, "Gauri", 2000.0f, 40000.0f);
		
		System.out.println("Savings Account:");
		System.out.println(s);
		s.withdraw(500); 		//withdraws 500  from accBalance it display remaining balance 500
		System.out.println();
		// current Account
		System.out.println("Current Account:");
		System.out.println(c);
		c.withdraw(1000);		//withdraws 1000 from accBalance it display remaining balance 1000
		
		

	}

}