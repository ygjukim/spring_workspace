package com.spring.ex05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:appContext.xml");
		ctx.refresh();
		
		Student stud = ctx.getBean("student1", Student.class);
		System.out.println("Name : " + stud.getName());
		System.out.println("Age : " + stud.getAge());
		
//		System.out.println("Employee : " + ctx.getBean("employee1", Employee.class));
		
		ctx.close();
	}

}
