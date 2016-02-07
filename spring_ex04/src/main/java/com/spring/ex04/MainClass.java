package com.spring.ex04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:appContext.xml");

		StudentInfo studInfo = ctx.getBean("studInfo",StudentInfo.class);
		studInfo.display();
		
		ctx.close();
	}

}
