package com.mayur.spring.lifecycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\mayur\\spring\\lifecycle\\annotation\\config.xml");
		
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
		((AbstractApplicationContext) context).close();	
	
	}
}
