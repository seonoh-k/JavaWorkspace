
public class ExceptionMain {

	public static void main(String[] args) { // 2.4
		
		// ����ó��(���� ������ �ڵ���� ������)
		
//		try {
//			���ܸ� �߻� ��Ű�� �ڵ�
//			���ܸ� �߻� ��Ű�� �ڵ�
//			���ܸ� �߻� ��Ű�� �ڵ�
//		}catch(����Ÿ��1) {
//			���ܸ� ó���ϴ� �ڵ�
//		}catch(����Ÿ��2) {
//			���ܸ� ó���ϴ� �ڵ�
//		}catch(����Ÿ��3) {
//			���ܸ� ó���ϴ� �ڵ�
//		}finally {
//			���� �߻� ������ ��� ���� ������ ���� �ϴ� �ڵ�	
//		}
		
		int number = 100;
		int result = 0;
		
//		for(int i=0; i<10; i++) {
//			try {
//				result = number / (int)(Math.random()*10);
//				System.out.println(result);				
//			}catch(ArithmeticException e) {
//				System.out.println("���� 0���� ������ �õ� �߻�");
//			}finally {
//				System.out.println("������ ����Ǵ� �ڵ�");
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
				System.out.println("���� 0���� ������ �õ� �߻�");
				System.out.println(e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ũ�⸦ Ȯ���ϼ���");
				System.out.println(e.getMessage());
			}catch(Exception e) { 
			// ��� ����Ÿ���� ó��. ���������� ���������� ó���ϱ� ������ ���� �������� �ۼ��ؾ� �Ѵ�.
				System.out.println("��� ���ܸ� ó���Ѵ�");
				System.out.println(e.getMessage());
			}finally {
				System.out.println("������ ����Ǵ� �ڵ�");
			}
		}
		
	}
}
