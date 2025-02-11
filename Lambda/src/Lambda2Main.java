
public class Lambda2Main { // 2.11

	public static void main(String[] args) {

		// ���ٽ����� �ۼ��� ������ ��ü
		MyFunction2 f1 = () -> System.out.println("f1.run()");
		
		// �������̽��� ��ü ���� �Ұ���
//		MyFunction2 f2 = new MyFunction2();
		
		// Myfunction2 �������̽��� ��� �޴� �͸� Ŭ������ ����. �߻� �޼ҵ带 �������̵� �ؾ��Ѵ�. Ŭ���� Ÿ������ ���� ���� ���� �Ұ���
		// �ڽ� Ÿ������ ������ ����, �������̵��� �޼ҵ带 ����.
		MyFunction2 f2 = new MyFunction2() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
			
		MyFunction2 f3 = getMyFunction();
		// f3 = System.out.println("f3.run()");
		
		f1.run();
		f2.run();
		f3.run();
		
		// �Լ� ���� ���ٽ����� �����ۼ�
		execute(() -> System.out.println("f4.run()"));
		
	}

	static void execute(MyFunction2 f) {
		f.run();
	}
	
	static MyFunction2 getMyFunction() {
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
}
