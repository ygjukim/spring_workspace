package com.spring.ex04;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("수영");
		hobby.add("요리");
		
		Student student = new Student("홍길동", 12, hobby);
		student.setHeight(170);
		student.setWeight(70);
		
		return student;
	}
	
	@Bean
	public StudentInfo studInfo() {
		return new StudentInfo(student1());
	}
}
