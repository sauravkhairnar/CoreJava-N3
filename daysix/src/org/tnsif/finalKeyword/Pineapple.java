package org.tnsif.finalKeyword;

public class Pineapple extends Cake {
 private int price;
///void display()
//{
//	System.out.println();
//}
 final void display(int price)
 {
	 System.out.println("the price is ="+price);
 }
public int getPrice() {
	return price;
}
public void setPrice(int price) 
{
	this.price = price;
}
}
