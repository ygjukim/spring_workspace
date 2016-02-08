package com.spring.ex06;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin_info.properties"));
			
			System.out.println("Admin ID: " + env.getProperty("adminid"));
			System.out.println("Admin PW: " + env.getProperty("adminpw"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("classpath:appContext.xml");
		gCtx.refresh();
		
		AdminConnection conn = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin ID: " + conn.getAdminId());
		System.out.println("admin PW: " + conn.getAdminPw());
		
		gCtx.close();
		ctx.close();
	}

}
