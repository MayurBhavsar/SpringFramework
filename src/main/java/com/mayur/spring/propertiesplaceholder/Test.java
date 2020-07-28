package com.mayur.spring.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/propertiesplaceholder/config.xml");

		Server server = (Server) context.getBean("server");
		System.out.println(server);
		((AbstractApplicationContext) context).close();
	}
}
