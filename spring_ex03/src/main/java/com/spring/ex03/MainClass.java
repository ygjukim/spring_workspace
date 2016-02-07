package com.spring.ex03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appContext.xml");

		StudentInfo studInfo = ctx.getBean("studInfo", StudentInfo.class);
		studInfo.display();
		
		studInfo.setStudent((Student)ctx.getBean("student2", Student.class));
		studInfo.display();
		
		studInfo.setStudent(ctx.getBean("student3", Student.class));
		studInfo.display();

		ctx.close();
	}
}
