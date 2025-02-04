import com.javachobo.circle.Circle; // 다른 패키지의 클래스를 사용하려면 위치를 표시해야 한다.
									// 다른 패키지의 모든 클래스를 사용하려면 *

public class CircleMain {

	public static void main(String[] args) {

		Circle c = new Circle(10, 20, 5);
		
		double result = c.getArea();
		
		System.out.println(result);
		
	}

}
