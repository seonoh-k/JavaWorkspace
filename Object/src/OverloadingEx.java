
public class OverloadingEx {

	// �����ε�(�޼ҵ��� Ư��) : �������� �� ����
	// �� Ŭ���� �ȿ� ���� �̸��� �޼ҵ带 �����ϴ� ��
	// ��, �Ű������� Ÿ�� or ������ �޶���Ѵ�.
	
	void add() {
		
	}
	
	void add(int x) {
		
	}
	
	void add(double x) {
		
	}
	
	void add(int x, int y) {
		
	}
	
	void add(int x, long y) {
		
	}
	
	void add(long x, int y) {
		
	}
	
//	int add(int x, int y) {
//		����Ÿ���� �����ε��� ��� ����. error
//	} 
	
	
	
}
