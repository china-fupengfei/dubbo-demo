package com.baoy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baoy.bean.User;
import com.baoy.dao.UserDao;
import com.baoy.service.IDubboDemoService;

@Service("dubboDemoService")
public class DubboDemoServiceImpl implements IDubboDemoService {

	@Autowired
	UserDao userDao;
	
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
