
public class ExceptionMain {

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
		
//		for(int i=0; i<10; i++) {
//			try {
//				result = number / (int)(Math.random()*10);
//				System.out.println(result);				
//			}catch(ArithmeticException e) {
//				System.out.println("값을 0으로 나누기 시도 발생");
//			}finally {
//				System.out.println("무조건 실행되는 코드");
//			}
//		}
		
		// 2.5
		int[] arr = new int[3];
		for(int j=0; j<10; j++) {
			try {
				for(int i=0; i<5; i++) {
					arr[j] = j + 1;
				}
				result = number / (int)(Math.random()*10);
				System.out.println(result);				
			}catch(ArithmeticException e) {
				System.out.println("값을 0으로 나누기 시도 발생");
				System.out.println(e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기를 확인하세요");
				System.out.println(e.getMessage());
			}catch(Exception e) { 
			// 모든 예외타입을 처리. 위에서부터 순차적으로 처리하기 때문에 가장 마지막에 작성해야 한다.
				System.out.println("모든 예외를 처리한다");
				System.out.println(e.getMessage());
			}finally {
				System.out.println("무조건 실행되는 코드");
			}
		}
		
	}
}
