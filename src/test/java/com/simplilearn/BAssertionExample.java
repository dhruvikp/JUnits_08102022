package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BAssertionExample {

	
	@Test
	void test() {
		Assertions.assertEquals(8, 8);
		
		String str = null;
		String str1 = "Simplilearn";
		
		Assertions.assertNull(str);
		Assertions.assertNotNull(str1);
		
		Assertions.assertTrue(5>0);
		
		
		String[] a1 = {"A" , "B"};
		String[] a2 = {"A", "B"};
		
		Assertions.assertNotEquals(a1, a2);
		
		Assertions.assertArrayEquals(a1, a2);
	
	}
	
	
}
