
public class Box<T> { // 2.10

	T name;
	// T == ������Ÿ��
	// Ÿ���� �̸� �������� �ʰ� �ʿ��� �� ������ �� �ִ�.
	
	T getName() {
		return this.name;
	}
	
	void setName(T name) {
		this.name = name;
	}
}
