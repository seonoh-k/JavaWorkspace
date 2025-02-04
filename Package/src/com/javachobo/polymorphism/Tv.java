package com.javachobo.polymorphism;

public class Tv extends Product { // 2.4

	public Tv() {
		super(100);
	} 

	@Override
	public String toString() {
		return "Tv";
	}
	// Object가 가진 메소드 toString()을 오버라이딩한다. 
	
	
}
