package com.spring.ex06;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	private Environment env;
	private String adminId;
	private String adminPw;
	
	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		System.out.println("call setEnvironment()...");
		env = environment;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("call afterPropertiesSet()...");
//		adminId = env.getProperty("adminid");
//		adminPw = env.getProperty("adminpw");		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("call destroy()...");
	}
	
}
