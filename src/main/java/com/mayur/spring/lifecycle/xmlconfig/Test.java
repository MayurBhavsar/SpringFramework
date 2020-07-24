package com.mayur.spring.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\mayur\\spring\\lifecycle\\xmlconfig\\config.xml");
		
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
		((AbstractApplicationContext) context).close();	
	}

}
