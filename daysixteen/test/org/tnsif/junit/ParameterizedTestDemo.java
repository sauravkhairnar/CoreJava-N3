package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
class ParameterizedTestDemo {

	@ParameterizeTest
	@ValueSource(strings="nia","diya")
	void test() 
	{
		System.out.println("Vaibhaya");
	}

}
