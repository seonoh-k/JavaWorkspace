
public class ThrowsExceptionMain { // 2.5
											// 예외 처리를 JVM, 시스템에 맡긴다.
	public static void main(String[] args) {// throws Exception  // 2.5
		
		// 예외 선언하기
		// throws
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("예외 처리됨");
		}
		
	}

	static void method1() throws Exception {
		method2();
	}
	
//	예외 처리하기
//	static void method2() {
//		try {
//			throw new Exception();			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	// 예외 선언
	static void method2() throws Exception {
		throw new Exception();
	}
	
}
