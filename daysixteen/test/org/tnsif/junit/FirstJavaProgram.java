package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgram {

	@Test
	@DisplayName("SimpleJunitTestMethod")
	void test() 
	{
		System.out.println("First JUnit Test Case");
	}
	
	@Test
	void display() 
	{
		System.out.println("Welcome to JUnit 5 Testing");
	}
	

}
