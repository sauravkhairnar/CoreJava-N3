package org.tnsif.junit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public class JunitAnotation {
	@Test
	@DisplayName("SimpleJunitTestMethod")
	void test() 
	{
		System.out.println("First JUnit Test Case");
	}
	
	@Test
	@BeforeAll
	static void display() 
	{
		System.out.println("Welcome to JUnit 5 Testing");
	}
	@Test
    @AfterEach
    @Disabled
	 void  accept()
	 {
		 System.out.println("After Each Method Demo");
	 }
	

}

