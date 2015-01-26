package com.diegotcba.userservice;

public class DemoService {
	
	public static void main(String[] args)
	{
		System.out.println("Demo UserService \n\n");
		
		UserService service=UserServiceFactory.getLocalService();
		
//		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
//		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
//		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		
		
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		service.newUser("emi2red", "865788", "emi.red@gmail.com", "Emi", "Rojas");
		
		service.deleteUser(1);
		
		System.out.println(service.getUsers().size());
		
		System.out.println(service.getListUsers());
	}
}
