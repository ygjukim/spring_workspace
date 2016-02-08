package com.reflection.ex;

import java.lang.reflect.Modifier;

public class GetClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		
		Class klass = employee.getClass();
//		Class klass = Employee.class;
//		Class klass = Class.forName("com.reflection.ex.Empolyee");
				
	    System.out.println( "Class name: " + klass.getName());
	    System.out.println( "Super class: " + klass.getSuperclass());
	      
	    int mods = klass.getModifiers();
	    System.out.println( "Class is public: " + Modifier.isPublic(mods));
	    System.out.println( "Class is final: " +  Modifier.isFinal(mods));
	    System.out.println( "Class is abstract: " + Modifier.isAbstract(mods)); 		
	}

}
