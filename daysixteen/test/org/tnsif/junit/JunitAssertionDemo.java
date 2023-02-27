package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Assert;
import org.junit.Test;
public class JunitAssertionDemo {
	@Test
	void test()
	{
		assertEquals(12,12);
	}
	@Test
	void display()
	{
		assertFalse(12==12);
	}
	@Test
	void Display()
	{
		assertFalse(12==1);
	}

}
