package com.topic3.practice3;

public class Main {
	
	public static void main(String[] args)
	{
		MiniApplication myApp=new MiniApplication("MyApp", 5);
		myApp.openFile("FileNumber1");
		myApp.openFile("FileNumber2");
		myApp.openFile("FileNumber3");
		myApp.openFile("FileNumber4");
		myApp.openFile("FileNumber5");
		
		myApp.openFile("FileNumber3");
		
		System.out.println(myApp.getRecentList().toString());
	}

}
