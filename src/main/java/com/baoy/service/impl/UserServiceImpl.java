package com.baoy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Component; 

import com.baoy.bean.User;
import com.baoy.dao.UserDao;
import com.baoy.service.UserService;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 上午10:24:54
 *
 * desc: ...
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	
	
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public void delUserById(int userId) {
		userDao.delUserById(userId);
	}

	public User getUserById(int userId) {
		return 	userDao.getUserById(userId);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

}
