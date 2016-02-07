package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String appCtxPath = "classpath:appContext.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(appCtxPath);
		MyCalculator myCalc = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalc.add();
		myCalc.sub();
		myCalc.mul();
		myCalc.div();

		ctx.close();
	}
	
}
