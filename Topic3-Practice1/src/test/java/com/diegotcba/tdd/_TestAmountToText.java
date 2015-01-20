package com.diegotcba.tdd;

import org.junit.Test;

import junit.framework.TestCase;

public class _TestAmountToText extends TestCase {
	
	@Test
	public void testToText()
	{
		Check check=new Check(2523.04);
		assertEquals(String.class,check.getAmountText().getClass());
	}
	
	@Test
	public void testCentsToText()
	{
		Check check=new Check(2523.04);
		assertTrue(check.getAmountText().contains("04/100"));
	}
	
	@Test
	public void testNoCentsToText()
	{
		Check check=new Check(2523);
		assertEquals(false,check.getAmountText().contains("/"));
	}
	
	@Test
	public void testLess19ToText()
	{
		Check check=new Check(2513);
		assertEquals(true,check.getAmountText().contains("thirteen"));
	}
	
	@Test
	public void testTensToText()
	{
		Check check=new Check(2523);
		assertEquals(true,check.getAmountText().contains("twenty-three"));
	}
	
	@Test
	public void testThousandsToText()
	{
		Check check=new Check(2523);
		assertEquals(true,check.getAmountText().contains("two thousand"));		
	}

	@Test
	public void testHundredsToText()
	{
		Check check=new Check(2523);
		assertEquals(true,check.getAmountText().contains("five hundred"));
	}
	
	@Test
	public void testAmountToText()
	{
		Check check=new Check(2523.04);
		assertEquals("two thousand, five hundred twenty-three and 04/100 dollars",check.getAmountText());		
	}
}
