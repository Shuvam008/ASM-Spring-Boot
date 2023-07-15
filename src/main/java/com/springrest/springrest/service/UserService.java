package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.User;

public interface UserService {
	
	public List<User> getUsers();
	public User getUser(long userID);
	public User getUsersByUsers(String user);
	public User addUser(User user);
	public User UpdateUser(User user);
	public void deleteUser(long userID);
}
