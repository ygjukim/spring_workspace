package com.spring.ex05;

import javax.annotation.*;

public class Employee {

   public String _firstName;
   public String _lastName;
   private int _salary;

   public Employee() {
      this( "John", "Smith", 50000);
   }
 
   public Employee(String fn, String ln, int salary) {
      _firstName = fn;
      _lastName = ln;
      _salary = salary;
   }
   
   public int getSalary() {
      return _salary;
   }
   
   public void setSalary(int salary) {
      _salary = salary;
   }
   
   public String toString() {
      return "Employee: " + _firstName +  " " + _lastName + " " + _salary;
   }
   
   @PostConstruct
   public void start() {
	   System.out.println("call start()...");
   }
   
   @PreDestroy
   public void stop() {
	   System.out.println("call stop()...");
   }

}
