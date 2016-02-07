package com.spring.ex02;

public class Pencil6BWithEraser extends Pencil6B {

	public void use() {
		super.use();
		
		System.out.println("그리고 지우개로 지울 수 있습니다...");
	}
}
