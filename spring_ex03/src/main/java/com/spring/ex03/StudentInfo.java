package com.spring.ex03;

public class StudentInfo {

	private Student student;

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
