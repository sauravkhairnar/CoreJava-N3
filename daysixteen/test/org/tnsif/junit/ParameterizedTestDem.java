package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDem {

	@ParameterizedTest
	@ValueSource(String= {"Nia","Diya"})
	void test() {
		System.out.println("hello");
	}

}
