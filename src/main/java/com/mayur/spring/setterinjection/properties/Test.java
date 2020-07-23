package com.mayur.spring.setterinjection.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\mayur\\spring\\setterinjection\\properties\\config.xml");
		
		ContriesAndLangs contry = (ContriesAndLangs) context.getBean("contires");
		System.out.println(contry);
		((AbstractApplicationContext) context).close();
		
	}

}
