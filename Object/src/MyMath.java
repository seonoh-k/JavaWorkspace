
public class MyMath {

	// �ν��Ͻ� �޼ҵ�
	void add(int x, int y) {
		System.out.println(x + y);
	}
	
	
	// Ŭ���� �޼ҵ�
	// ���� ���� ��� ����
	static void add2(int x, int y) {
		System.out.println(x + y);
	}
	
	// ��� �� ����
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // Ŭ���� ����
	
	void instanceMethod() { // �ν��Ͻ� �޼ҵ�
		iv = 100;
		cv = 300; // �̹� ������ �����̱� ������ ��� ����
	}
	
	static void staticMethod() { // Ŭ���� �޼ҵ�
		cv = 200;
//		iv = 100; �������� �ʾұ� ������ ���� ���� ����� �� �ִ� ����ƽ �޼ҵ忡���� ����� �� ����
	}
	
	
}
