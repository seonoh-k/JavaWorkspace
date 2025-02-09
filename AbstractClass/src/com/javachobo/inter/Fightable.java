package com.javachobo.inter;

public interface Fightable extends Moveable { // 대부분 ~able로 끝난다. // 2.4
	
	// 인터페이스
	// 생성 불가, 클래스에 상속만 가능
	// 추상 메소드는 자식이 오버라이딩 한다
	// 인터페이스와 클래스간 상속은 implements를 사용한다
	// 인터페이스간 상속은 extends를 사용한다 (자식 클래스에서 오버라이딩)
	// [public static final] 상수(변수 선언)
	// [public abstract] 메소드
	// [public] default 메소드
	// [public] static 메소드     *대괄호 생략 가능
	
	
	public static final String FIRST_NAME = "HONG";
	
	public abstract String send(int x);
	
	public default void setStatue(int x) {
		System.out.println(x);
	} // 오버라이딩 가능
	
	public static void printName(String name) {
		System.out.println(name);
	} // 오버라이딩 불가능
	
}
