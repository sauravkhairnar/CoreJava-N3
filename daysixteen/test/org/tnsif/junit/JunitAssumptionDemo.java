package org.tnsif.junit;
import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class JunitAssumptionDemo {
	@Test
	void test()
	{
		Assumptions.assumeTrue(12==12);
	}
	@Test
	void accpet()
	{
		Assumptions.assumeFalse(12==1);
	}

}
