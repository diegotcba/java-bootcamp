package com.diegotcba.userservice;

import java.util.List;

public interface UserService {
	public void newUser(String username, String password, String email, String name, String lastname);
	public List<User> getUsers();
	public int getUsersCount();
	public User getUser(int id);
	public void updateUser(int userId,String username, String password, String email, String name, String lastname);
	public void deleteUser(int userId);
	public String getListUsers();
}
