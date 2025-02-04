
public abstract class Player { // 2.4
	
	// 추상 클래스
	// 1. 생성이 불가하다
	// 2. 상속만 가능하다
	// 3. 추상 메소드가 존재한다 (구현부가 없는 메소드)
	// 4. 추상 메소드는 자식이 반드시 오버라이딩 해야 한다 (강제)
	// 5. 일반 클래스와 동일하다
	
	int x;
	int y; 
	
	Player() {
		
	}
	
	void play() {
		
	}
	
	abstract void stop(); // 추상 메소드

}
