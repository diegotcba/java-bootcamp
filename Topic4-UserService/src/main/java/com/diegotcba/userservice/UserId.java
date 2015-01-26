package com.diegotcba.userservice;

public class UserId {
	private static UserId instance=null;
	private int id;
	
	private UserId()
	{
		id=1;
	}
	
	public static UserId getInstance()
	{
		if (instance==null)
		{
			instance=new UserId();
		}
		return instance;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void updateId()
	{
		id+=1;
	}
	
	public void resetId()
	{
		id=1;
	}
}
