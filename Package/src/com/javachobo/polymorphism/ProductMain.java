package com.javachobo.polymorphism;

public class ProductMain {

	public static void main(String[] args) { // 2.4
		
		Buyer buyer = new Buyer();
		
		Tv tv = new Tv();
		Audio au = new Audio();
		Computer com = new Computer();
		
		buyer.buy(tv);
		buyer.buy(au);
		buyer.buy(com);
		// Buyer가 부모 클래스인 Product를 포함하기 때문에 자식 클래스를 사용할 수 있다.
		
//		System.out.println("잔액 : " + buyer.money);
//		System.out.println("포인트 : " + buyer.bonusPoint);
		
		buyer.summury();
		
	}

}
