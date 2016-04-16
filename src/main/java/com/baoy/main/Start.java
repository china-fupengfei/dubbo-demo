package com.baoy.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 下午4:44:44
 *
 *          desc: ...
 */
public class Start {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath*:META-INF/spring/applictionContext.xml",
						"classpath*:META-INF/spring/applictionContext-dubbo-provider.xml" });
		context.start();
		System.in.read(); // 按任意键退出
	}

}
