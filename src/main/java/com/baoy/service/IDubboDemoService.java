package com.baoy.service;

import java.util.List;

import com.baoy.bean.User;

public interface IDubboDemoService {
	public List<User> getAllUsers();
	public void delUserById(int userId);
	public User getUserById(int userId);
	public void updateUser(User user);
	public void addUser(User user);
}
