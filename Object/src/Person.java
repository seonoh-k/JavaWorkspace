
public class Person {
	
	// OOP - Object-Oreinted Programming - 객체 지향 프로그래밍
	// 특성 : 다형성, 상속, 캡슐(은닉) -> 접근 제어자, 추상화
	// 객체 : 현실에 존재하는 유무형의 대상들
	// 속성(변수) : 눈, 코, 입, 팔, 다리, 이름, 나이, 키, 몸무게 ...
	// 기능(메소드) : 본다, 호흡, 냄새를 맡는다, 말한다, 먹는다, 걷는다, 자기소개 ...
	
	
	String name;   // 이름 
	int age;       // 나이
	double height; // 키
	
//	void showInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("키 : " + height);
//	}
	
	String showInfo2() {
		return name + ", " + age + ", " + height;
	}
	
	
	
	
}

// class 기본형
//	제어자 class className {
//		field
//		제어자 데이터타입 변수이름;
//		제어자 데이터타입 변수이름;
//		제어자 데이터타입 변수이름;
//		
//		제어자 리턴타입 메소드이름(매개변수) {
//			메소드 실행 코드
//			return 타입이 void가 아닌 경우 반환 값
//		}
//	}