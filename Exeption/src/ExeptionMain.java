
public class ExeptionMain {

	public static void main(String[] args) { // 2.4
		
		// 예외처리(예측 가능한 코드상의 문제점)
		
//		try {
//			예외를 발생 시키는 코드
//			예외를 발생 시키는 코드
//			예외를 발생 시키는 코드
//		}catch(예외타입1) {
//			예외를 처리하는 코드
//		}catch(예외타입2) {
//			예외를 처리하는 코드
//		}catch(예외타입3) {
//			예외를 처리하는 코드
//		}finally {
//			예외 발생 유무와 상관 없이 무조건 실행 하는 코드	
//		}
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println(result);				
			}catch(ArithmeticException e) {
				System.out.println("값을 0으로 나누기 시도 발생");
			}finally {
				System.out.println("무조건 실행되는 코드");
			}
		}
		
	}
}
