package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CCalculatorTest {

	Calculator c;
	
	@BeforeEach
	void init() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("Test when both argument are positive")
	void test_where_both_argument_positive() {
		
		// STEP 1: Prepare Inputs
		int a=1;
		int b = 1;
		
		// STEP 2 : Invoke Method and gets Actual Value
		int actual = c.calculate(a, b);
		
		// STEP 3: Setting up expectaton
		int expected = 2;
		
		// STEP 4: Assert Actual Value with Expected Value
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void test_where_both_argument_negative() {
		
		// STEP 1: Prepare Inputs
		int a=-1;
		int b =-1;
		
		// STEP 2 : Invoke Method and gets Actual Value
		int actual = c.calculate(a, b);
		
		// STEP 3: Setting up expectaton
		int expected = -2;
		
		// STEP 4: Assert Actual Value with Expected Value
		Assertions.assertEquals(expected, actual);
	}
}

