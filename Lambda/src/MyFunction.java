@FunctionalInterface
public interface MyFunction { // 2.10

	public abstract int max(int x, int y);
	// ���ٽ� �Լ��� �߻� �޼ҵ带 ���� ����
	// �Լ��� �������̽��� �������̵� ���� �ʴ´�.
	// ���ٽ� �Լ��� �Լ��� �������̽��� �����ΰ� �ȴ�.
	// �ݵ�� �߻� �޼ҵ� �ϳ��� �����ؾ� �Ѵ�.
	// �������̽� �ۼ� �� ������̼� @FunctionalInterface�� �ۼ��ϸ� �Լ��� �������̽��� �ۼ��ؾ߸� �Ѵ�
}
