package com.mayur.spring.constructorinjection.ambiguitysolution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * We are passing same value but in one scenario we get output double and in second
 * scenario we get String output. Because by default value consider as String if
 * it find String type constructor then it will execute it .If String constructor
 * is not present then it will search from top to bottom and try to convert value. 
 * we are passing integer value and integer can be store in double that's
 * why it gives double as output
 * 
 */
public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/constructorinjection/ambiguitysolution/config.xml");

		Addition addition1 = (Addition) context.getBean("addition1");
		Addition addition2 = (Addition) context.getBean("addition2");

		((AbstractApplicationContext) context).close();

	}
}

