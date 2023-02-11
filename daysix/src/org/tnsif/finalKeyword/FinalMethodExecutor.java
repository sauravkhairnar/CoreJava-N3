package org.tnsif.finalKeyword;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		Pineapple p=new Pineapple();
		p.flaour="BadamShake";
		p.display();
		p.setPrice(250);
		p.display(p.getPrice());
		

	}

}
