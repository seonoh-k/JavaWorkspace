package com.javachobo.polymorphism;

public class Audio extends Product { // 2.4

	public Audio() {
		super(150);
	} 

	@Override
	public String toString() {
		return "Audio";
	}
	// Object가 가진 메소드 toString()을 오버라이딩한다. 

	
	
}
