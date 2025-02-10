
public class LambdaMain {

	public static void main(String[] args) {

		// 함수형 인터페이스 작성
		// 함수형 인터페이스에 구현부를 대입
		MyFunction f = (x, y) -> x > y ? x : y;

		int max = f.max(10, 20);
		
		System.out.println(max);
		
	}

}
