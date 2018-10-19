package com.junit.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathClassTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void TestMax()
	{
		MathClass m = new MathClass();
		
//		int output = m.max(3, 4);
//		int expected = 4;		
//		
//		assertEquals(expected, output);
		
		assertEquals(3, m.max(3, 3));
		
	}
	
}
