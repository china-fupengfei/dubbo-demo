package com.baoy.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baoy.service.IDubboDemoService;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 下午1:48:37 desc: ...
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-dubbo-consumer.xml" })
public class ConsumerTest {

    @Resource IDubboDemoService userService;

    @Test
    public void allUsersTest() {
        System.out.println(userService.getAllUsers());
    }

}
