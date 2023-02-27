package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ReapetedTestDemo {
	@Test
	@ReapeatedTest(5)
	void test() 
	{
		int num=1;
		while(num<5)
		{
			System.out.println("Hello Guys..!");
		}
	}

}
