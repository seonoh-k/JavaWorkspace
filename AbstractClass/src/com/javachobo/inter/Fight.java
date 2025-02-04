package com.javachobo.inter;

public class Fight extends Unit implements Fightable { // Interface 상속 // 2.4
	// Interface의 상속은 다중 상속이 가능하나, 일반적으로는 여러 인터페이스를 상속하는 하나의 인터페이스를 상속한다.

	@Override
	public String send(int x) {
		return "적 공격하기";
	}
	
	@Override
	public void move() {
		System.out.println("이동 중");
	}
	
}
