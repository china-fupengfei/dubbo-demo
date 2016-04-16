package com.baoy.test;
 

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baoy.bean.User;
import com.baoy.service.UserService;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 下午1:48:37
 *
 * desc: ...
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:appliction.xml","classpath:appliction-dubbo-consumer.xml"})
public class ConsumerTest {

	 @Resource
	UserService userService; 
	
	@Test
	public  void allUsersTest() { 
		 List<User> allUsers = userService.getAllUsers();
		System.out.println("\r\n\r\n\r\n"+allUsers.toString()+"\r\n\r\n\r\n"); 
	}
	
}
