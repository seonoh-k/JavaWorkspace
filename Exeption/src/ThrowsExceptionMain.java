
public class ThrowsExceptionMain { // 2.5
											// ���� ó���� JVM, �ý��ۿ� �ñ��.
	public static void main(String[] args) {// throws Exception  // 2.5
		
		// ���� �����ϱ�
		// throws
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("���� ó����");
		}
		
	}

	static void method1() throws Exception {
		method2();
	}
	
//	���� ó���ϱ�
//	static void method2() {
//		try {
//			throw new Exception();			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	// ���� ����
	static void method2() throws Exception {
		throw new Exception();
	}
	
}
