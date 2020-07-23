package com.mayur.spring.setterinjection.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\mayur\\spring\\setterinjection\\reftype\\config.xml");
		
		Student student = (Student) context.getBean("stud");
		System.out.println(student);
		((AbstractApplicationContext) context).close();
		
	}

}
