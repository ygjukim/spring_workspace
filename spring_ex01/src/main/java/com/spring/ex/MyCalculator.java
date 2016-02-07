package com.spring.ex;

public class MyCalculator {

	private Calculator calculator;
	private double firstNum;
	private double secondNum;
	
	
	public Calculator getCalculator() {
		return calculator;
	}


	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}


	public double getFirstNum() {
		return firstNum;
	}


	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}


	public double getSecondNum() {
		return secondNum;
	}


	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}

	public void add() {
		System.out.println(firstNum + " + " + secondNum + " = " + calculator.add(firstNum, secondNum));
	}

	public void sub() {
		System.out.println(firstNum + " - " + secondNum + " = " + calculator.subtract(firstNum, secondNum));
	}

	public void mul() {
		System.out.println(firstNum + " * " + secondNum + " = " + calculator.multiply(firstNum, secondNum));
	}

	public void div() {
		System.out.println(firstNum + " / " + secondNum + " = " + calculator.divide(firstNum, secondNum));
	}

}
