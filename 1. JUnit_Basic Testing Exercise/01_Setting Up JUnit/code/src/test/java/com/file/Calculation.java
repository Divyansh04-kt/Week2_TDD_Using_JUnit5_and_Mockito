package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculation {
	
	@Test
	public void testAddition() {
		int answer = 10 + 10;
		assertEquals(20, answer, "Addition test failed");
	}
	
	@Test
	public void testSubtraction() {
		int answer = 10 - 10;
		assertEquals(0, answer, "Subtraction test failed");
	}
	
	@Test
	public void testMultiplication() {
		int answer = 10 * 10;
		assertEquals(100, answer, "Multiplication test failed");
	}
	
	@Test
	public void testDivision() {
		int answer = 10 / 10;
		assertEquals(1, answer, "Division test failed");
	}
}
