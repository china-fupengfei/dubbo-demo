package com.baoy.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang3.ArrayUtils;
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
        System.out.println("=================== dubbo started ===================");
        System.out.println("**** You can input \"quit\" or \"exit\" to terminate ****");
        System.out.println("=================== dubbo started ===================");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String accept = reader.readLine();
            if (ArrayUtils.contains(new String[] { "quit", "exit" }, accept.toLowerCase())) {
                System.exit(0);
                cxt.close();
            }
        }
    }

}
