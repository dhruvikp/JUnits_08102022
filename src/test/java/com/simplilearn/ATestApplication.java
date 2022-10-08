package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ATestApplication {

	@BeforeAll
	public static void initAll() {
		System.out.println("Before All executed");
	}
	
	@BeforeEach
	void init() {
		System.out.println("Before Each executed");
	}
	
	
	@Test
	void test1() {
		System.out.println("Test1 executed");
	}
	
	
	@Test
	void test2() {
		System.out.println("Test2 executed");
	}
	
	@Test
	void test3() {
		System.out.println("Test3 executed");
	}
	
	
	@AfterEach
	void destroy() {
		System.out.println("After Each executed");
	}
	
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All executed");
	}
}
