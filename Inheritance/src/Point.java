
public class Point { // extends Object가 생략 돼있다. 상속 받지 않은 클래스는 Object를 상속 받는다. 모든 클래스는 Object를 상속 받음
	
	int x = 100;
	int y = 200;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x = " + x + ", y = " + y; 
	}
}
