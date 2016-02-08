package com.reflection.ex;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class klass = Class.forName(args[0]);
		
		Object newInstance = klass.newInstance();
		
		System.out.println("Just made : " + newInstance);	
	}

}
