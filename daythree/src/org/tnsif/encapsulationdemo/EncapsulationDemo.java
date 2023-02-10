//EncapsulationDemo.java
package org.tnsif.encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pin: ");
		HDFC h=new HDFC();
		h.setPin(s.nextInt());
		System.out.println(h.getPin());
		h.accept();

	}

}