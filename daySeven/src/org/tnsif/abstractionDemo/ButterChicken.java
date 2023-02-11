package org.tnsif.abstractionDemo;

public class ButterChicken extends Menu{
	@Override
	void recipe()
	{
		System.out.println("wash and cook chiken");
	}

	@Override
	void foodType() {
		System.out.println("non-veg");
	}
}
