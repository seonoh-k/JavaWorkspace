import com.javachobo.rectangel.Rectangle;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 20);
		
		int result = r.getArea2();
		
		System.out.println(result);
		
	}

}

// 접근 제어자
// public	  모든 패키지 허용
// protected  동일한 패키지 내의 클래스와 해당 클래스를 상속 받은 클래스만 허용
// default	  동일한 패키지 내의 클래스만 허용 생략가능
// private	  동일한 클래스만 허용