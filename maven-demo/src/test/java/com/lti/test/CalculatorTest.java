package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.demo.Calculator;

public class CalculatorTest {
	
	@Test
	public void additionOfTwoNos() {
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		assertEquals(30,result);
	}
	
	@Test
	public void subtractionOfTwoNos() {
		Calculator c = new Calculator();
		int result = c.sub(20, 10);
		assertEquals(10,result);
		
	}
	
	
}
