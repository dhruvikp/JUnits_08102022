package com.simplilearn;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class DNestedTest {

	
	@Nested
	class A {
		
		@Test
		public void test() {
			System.out.println("Nested Test executed..");
		}
	}
}
