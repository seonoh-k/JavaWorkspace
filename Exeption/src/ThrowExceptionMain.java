
public class ThrowExceptionMain { // 2.5

	public static void main(String[] args) {
		
		// 예외를 강제로 발생시키기
		// throw
		
		try {
			Exception e = new Exception("강제로 발생시킨 예외");
			throw e; // Exception 객체를 예외로 발생
		}catch(Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage()); // .getMessage() 시스템 메세지 출력
			e.printStackTrace(); // 예외가 발생하면 로그와 위치를 알 수 있다.
		}
	}
}
