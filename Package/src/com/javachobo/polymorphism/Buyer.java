package com.javachobo.polymorphism;

public class Buyer { // 2.4

	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	// 다형성을 이용해 데이터타입을 정의한 배열
	int i = 0;
	
	void buy(Product prod) { // Product를 포함하게 된다.
	// 자식 클래스로는 오버로딩 하면 같은 메소드가 너무 많아지기 때문에 부모 클래스를 매개변수로 사용
		
		if(money < prod.price) {
			System.out.println("잔액 부족");
			return; // 강제 종료
		}
		
		// 자식 클래스가 공통으로 가지는 부모 클래스의 멤버를 사용
		money -= prod.price; 
		bonusPoint += prod.bonusPoint;

		item[i++] = prod;
		
		//System.out.println(prod.toString() + "를 구매했습니다.");

	}

	void summury() {
		int sum = 0;
		int bonusPoint = 0;
		String listItem = "";
		
		for(Product prod : item) {
			
			if(prod != null) {
				sum += prod.price;
				bonusPoint += prod.bonusPoint;
				listItem += prod.toString() + " ";
			}
			
//			if(prod == null) {
//				break;
//			}
			
//			sum += prod.price;
//			bonusPoint += prod.bonusPoint;
//			listItem += prod.toString() + " ";
		}
		
		
		System.out.println("총 금액 : " + sum);
		System.out.println("포인트 : " + bonusPoint);
		System.out.println("구매 목록 : " + listItem);
		
	}
	
	
}
