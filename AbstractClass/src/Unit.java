
public abstract class Unit { // 2.4
	
	int x,y;
	
	abstract void move(int x, int y);
	// 자식 클래스에 공통적으로 필요하지만 각자 다른 기능이 필요할 때 추상 메소드 사용
	void stop() {
		System.out.println("Stop");
	};
	
}
