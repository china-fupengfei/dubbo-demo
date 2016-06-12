package com.baoy.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 下午4:44:44 desc: ...
 */
public class Start {

    public static void main(String[] args) throws IOException {
        String[] springCfgs = { "classpath*:META-INF/spring/applictionContext.xml", "classpath*:META-INF/spring/applictionContext-dubbo-provider.xml" };
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(springCfgs);
        cxt.start();
        System.out.println("================= dubbo started=================");
        System.in.read(); // 按任意键退出
        cxt.close();
    }

}
