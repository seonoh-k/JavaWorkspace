
public class LambdaMain {

	public static void main(String[] args) {

		// �Լ��� �������̽� �ۼ�
		// �Լ��� �������̽��� �����θ� ����
		MyFunction f = (x, y) -> x > y ? x : y;

		int max = f.max(10, 20);
		
		System.out.println(max);
		
	}

}
