package org.tnsif.gemericsDemo;
class Genericsmethod{
	public static<E>void print(E[] element){
		for(E itr:element)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}
}

public class GenericsMethodDemo {

	public static void main(String[] args) {
		GenericsMethod m=new GenericsMethod();
		Integer[]int array1={10,40,35,61};
		Character[]char array2= {'a','b','c','d'};
}
}
