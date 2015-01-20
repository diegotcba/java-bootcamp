package com.topic3.practice3;

import static org.junit.Assert.*;

import org.junit.Test;

public class _RecentListTest {

	@Test
	public void testInitEmptyList()
	{
		MiniApplication myApp=new MiniApplication("Example Application",5);
		assertEquals(0,myApp.getRecentListSize());
	}
	
	@Test
	public void testOpening2Files()
	{
		MiniApplication myApp=new MiniApplication("Example App",5);
		myApp.openFile("FileNumber1");
		myApp.openFile("FileNumber2");
		assertEquals(2,myApp.getRecentListSize());
	}
	
	@Test
	public void testRecentListFull()
	{
		MiniApplication myApp=new MiniApplication("MyApp",5);
		myApp.openFile("FileNumber1");
		myApp.openFile("FileNumber2");
		myApp.openFile("FileNumber3");
		myApp.openFile("FileNumber4");
		myApp.openFile("FileNumber5");
		
		myApp.openFile("FileNumber6");
		
		assertEquals("FileNumber6", myApp.getFileName(5));		
	}
	
	@Test
	public void testRepeatedFileTop()
	{
		MiniApplication myApp=new MiniApplication("MyApp", 5);
		myApp.openFile("FileNumber1");
		myApp.openFile("FileNumber2");
		myApp.openFile("FileNumber3");
		myApp.openFile("FileNumber4");
		myApp.openFile("FileNumber5");
		
		myApp.openFile("FileNumber3");
		
		assertEquals("FileNumber3", myApp.getFileName(1));		
	}
	
	@Test
	public void testGetPositionFile()
	{
		MiniApplication myApp=new MiniApplication("MyApp", 5);
		myApp.openFile("FileNumber1");
		myApp.openFile("FileNumber2");
		myApp.openFile("FileNumber3");
		myApp.openFile("FileNumber4");
		myApp.openFile("FileNumber5");
		
		assertEquals(4, myApp.getRecentListPosition("FileNumber4"));
	}
	
	@Test
	public void testRepeatedFileReorderingList()
	{
		MiniApplication myApp=new MiniApplication("MyApp", 5);
		myApp.openFile("FileNumber1");
		myApp.openFile("FileNumber2");
		myApp.openFile("FileNumber3");
		myApp.openFile("FileNumber4");
		myApp.openFile("FileNumber5");
		
		myApp.openFile("FileNumber3");
		
		assertEquals("FileNumber3", myApp.getFileName(1));		
		assertEquals("FileNumber1", myApp.getFileName(2));		
		assertEquals("FileNumber2", myApp.getFileName(3));		
		assertEquals("FileNumber4", myApp.getFileName(4));		
		assertEquals("FileNumber5", myApp.getFileName(5));		
		
	}
	
}
