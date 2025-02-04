
public class MyMath {

	// 인스턴스 메소드
	void add(int x, int y) {
		System.out.println(x + y);
	}
	
	
	// 클래스 메소드
	// 생성 없이 사용 가능
	static void add2(int x, int y) {
		System.out.println(x + y);
	}
	
	// 멤버 간 참조
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스 변수
	
	void instanceMethod() { // 인스턴스 메소드
		iv = 100;
		cv = 300; // 이미 생성된 변수이기 때문에 사용 가능
	}
	
	static void staticMethod() { // 클래스 메소드
		cv = 200;
//		iv = 100; 생성하지 않았기 때문에 생성 없이 사용할 수 있는 스태틱 메소드에서는 사용할 수 없다
	}
	
	
}
