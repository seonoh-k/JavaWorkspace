package com.javachobo.polymorphism;

public class Computer extends Product { // 2.4

	public Computer() {
		super(200);
	} 

	@Override
	public String toString() {
		return "Computer";
	}
	// Object가 가진 메소드 toString()을 오버라이딩한다. 
	
	
}
