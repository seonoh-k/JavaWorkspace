
public abstract class Unit { // 2.4
	
	int x,y;
	
	abstract void move(int x, int y);
	// �ڽ� Ŭ������ ���������� �ʿ������� ���� �ٸ� ����� �ʿ��� �� �߻� �޼ҵ� ���
	void stop() {
		System.out.println("Stop");
	};
	
}
