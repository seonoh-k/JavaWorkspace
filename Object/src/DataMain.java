
public class DataMain {

	public static void main(String[] args) {
		
		DataMain da = new DataMain(); 
		// �ν��Ͻ� �޼ҵ带 ����ϱ� ���� �ڽ� Ŭ������ ���� �Լ� ���� ��ü�� ����
		
		Data d1 = new Data();
		d1.x = 10;
		System.out.println("������ x = " + d1.x);
		
		change(d1.x);
		System.out.println("������ x = " + d1.x);
		
		da.change1(d1.x);
	}

	static void change(int x) { // ���� ����
		x = 1000; // �޼ҵ� �ȿ����� ����, ���������� ����ϹǷ� d1.x�� ���� �Ѽյ��� �ʴ´�.
		System.out.println("change x = " + x );
	} // �޼ҵ� ���� �� �������� x�� �������.
	
	void change1(int x) { // �ν��Ͻ� �޼ҵ�
		x = 2000;
		System.out.println("change x = " + x);
	}
}
