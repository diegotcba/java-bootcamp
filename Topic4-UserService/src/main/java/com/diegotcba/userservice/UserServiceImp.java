package com.diegotcba.userservice;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {
	private List<User> users;

	public UserServiceImp()
	{
		users=new ArrayList<User>();
	}
	
	public void newUser(String username, String password, String email, String name, String lastname) {
		// TODO Auto-generated method stub
		users.add(new User(UserId.getInstance().getId(),username,password,email,name,lastname));
		UserId.getInstance().updateId();
	}

	public int getUsersCount() {
		// TODO Auto-generated method stub
		return users.size();
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		User aux=null;
		for (User user : users) {
			if(user.getId()==id)
			{
				aux=user;
			}
		}
		return aux;
	}

	public void updateUser(int userId, String username, String password, String email, String name, String lastname) {
		// TODO Auto-generated method stub
		User aux=getUser(userId);
		aux.setUsername(username);
		aux.setPassword(password);
		aux.setEmail(email);
		aux.setName(name);
		aux.setLastname(lastname);
		
		deleteUser(userId);
		users.add(aux);
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		int index=users.indexOf(getUser(userId));
		users.remove(index);
	}

	public String getListUsers() {
		// TODO Auto-generated method stub
		String list="";
		for (User user : users) {
			list+="\nId: " + user.getId() + "\nUsername: " + user.getUsername() + "\nEmail: " + user.getEmail() + "\nComplete Name: " + user.getLastname() + ", " + user.getName() + "\n\n"; 
		}
		return list;
	}

	
}
