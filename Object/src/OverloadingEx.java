
public class OverloadingEx {

	// 오버로딩(메소드의 특성) : 다형성의 한 형식
	// 한 클래스 안에 같은 이름의 메소드를 정의하는 것
	// 단, 매개변수의 타입 or 갯수는 달라야한다.
	
	void add() {
		
	}
	
	void add(int x) {
		
	}
	
	void add(double x) {
		
	}
	
	void add(int x, int y) {
		
	}
	
	void add(int x, long y) {
		
	}
	
	void add(long x, int y) {
		
	}
	
//	int add(int x, int y) {
//		리턴타입은 오버로딩과 상관 없다. error
//	} 
	
	
	
}
