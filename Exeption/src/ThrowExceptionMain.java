
public class ThrowExceptionMain { // 2.5

	public static void main(String[] args) {
		
		// ���ܸ� ������ �߻���Ű��
		// throw
		
		try {
			Exception e = new Exception("������ �߻���Ų ����");
			throw e; // Exception ��ü�� ���ܷ� �߻�
		}catch(Exception e) {
			System.out.println("���� �޼��� : " + e.getMessage()); // .getMessage() �ý��� �޼��� ���
			e.printStackTrace(); // ���ܰ� �߻��ϸ� �α׿� ��ġ�� �� �� �ִ�.
		}
	}
}
