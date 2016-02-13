package com.spring.ex07.biz.service;

public class DataNotFoundException extends Exception {

	private static final long serialVersionUID = -6761545338668861523L;

	public DataNotFoundException() {
		super();
	}
	
	public DataNotFoundException(String msg) {
		super(msg);
	}
	
	public DataNotFoundException(Throwable th) {
		super(th);
	}
	
	public DataNotFoundException(String msg, Throwable th) {
		super(msg, th);
	}
}
