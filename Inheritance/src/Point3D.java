
public class Point3D extends Point {

	int x = 10; // 부모 클래스와 같은 변수가 있는 경우 자식의 변수를 사용한다.
	int y = 20;
	int z;
	
//	Point3D() { 자식 클래스의 기본 생성자
//		super(); // Point(); 부모의 생성자 호출
//	}
	
//	Point3D() {
//		super(); // 부모의 기본 생성자 호출 생략 가능
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
	
	Point3D(int x, int y, int z) {
		super(x, y); // Point(x, y);
		this.z = z;
	}
	
	// 오버라이드 : 메소드의 재정의
	// 상속에서 부모의 메소드를 자식이 재정의 하는 것
	// 메소드는 부모의 메소드와 동일해야한다.
	// 다형성의 형태이다.
	@Override
	String getLocation() { 
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
	
	void printVar() {
		System.out.println(x);
		System.out.println(this.x);  // Print3D.x this 생략가능
		System.out.println(super.x); // Point.x 부모의 변수 사용
	}
}
