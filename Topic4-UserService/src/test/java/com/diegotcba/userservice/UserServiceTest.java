package com.diegotcba.userservice;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceTest {
	
	@Test
	public void testNullService()
	{
		UserService service=UserServiceFactory.getLocalService();
		assertNotNull(service);
	}
	
	@Test
	public void testNewUser()
	{
		UserService service=UserServiceFactory.getLocalService();
		
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		assertEquals(1,service.getUsersCount());
	}
	
	@Test
	public void testNewUsers()
	{
		UserService service=UserServiceFactory.getLocalService();
		
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		assertEquals(3,service.getUsersCount());
	}
	
	@Test
	public void testListNewUsers()
	{
		UserService service=UserServiceFactory.getLocalService();
		
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		
		assertTrue(service.getListUsers().length()>0);
		
	}
	
	@Test
	public void testUpdateUser()
	{
		UserService service=UserServiceFactory.getLocalService();
		
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		
		service.updateUser(2, "emi2red", "865788", "emi.red@gmail.com", "Emi", "Rojas");
		
		assertEquals("emi2red",service.getUser(2).getUsername());
		assertEquals(2,service.getUsers().size());
	}
	
	@Test
	public void testDeleteUser()
	{
		UserService service=UserServiceFactory.getLocalService();
		
		
		UserId.getInstance().resetId();
		
		service.newUser("diegot", "123456", "tellodiego@yahoo.com", "Diego", "Tello");
		service.newUser("emi2red", "865788", "emi.red@gmail.com", "Emi", "Rojas");
		
		service.deleteUser(1);
		
		assertEquals(1,service.getUsers().size());
		assertEquals("emi2red",service.getUser(2).getUsername());
	}

}
