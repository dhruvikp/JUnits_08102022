package com.simplilearn;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GDynmaicDemoTest {
	Calculator c;

	@BeforeEach
	void init() {
		c = new Calculator();
	}

	@TestFactory
	Collection<DynamicTest> test() {
		Collection<DynamicTest> tests = new ArrayList<DynamicTest>();
		tests.add(DynamicTest.dynamicTest("When both argument are positive",
				() -> Assertions.assertEquals(2, c.calculate(1, 1))));
		tests.add(DynamicTest.dynamicTest("When both arguments are negative",
				() -> Assertions.assertEquals(-2, c.calculate(-1, -1))));
		tests.add(DynamicTest.dynamicTest("When one agument is negative and one is positive",
				() -> Assertions.assertEquals(0, c.calculate(-1, 1))));
		return tests;
	}
}