package com.diegotcba.userservice;

public class UserServiceFactory {
	
	private UserServiceFactory() {};
	
	public static UserService getLocalService()
	{
		return new UserServiceImp();
	}
}
