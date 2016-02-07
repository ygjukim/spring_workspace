package com.spring.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentInfo {

	@Autowired
	private Student student;

	public StudentInfo() {
		super();
	}

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void display() {
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
		System.out.println("Hobby : " + student.getHobby());
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
	}
		
}
