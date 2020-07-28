package com.mayur.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/spring/constructorinjection/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		((AbstractApplicationContext) context).close();
		
	}

}
