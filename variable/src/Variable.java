
public class Variable {

	public static void main(String[] args) {
		// �⺻��(8��)
		// ��, ����(����, �Ǽ�), ����(�ѱ���)
		// �� : boolean
		// ���� : byte(-128 ~ 127), short(-32768 ~ 32767), int, long
		// ���� : cahr
		// �Ǽ� : float, double
		
		// ���� ���� : Ÿ�� ������ 
		
//		boolean bn = false; // false, true
//		System.out.println(bn);
//		
//		byte b = 10;
//		System.out.println(b);
//		
//		short s = 10;
//		System.out.println(s);
//		
//		int i = 10; //������ �⺻������ int���� ���
//		System.out.println(i);
//		
//		long l = 10L;
//		System.out.println(l);
//		
//		char c = 'A';
//		System.out.println(c);
//		System.out.println((int)c);
//		
//		float f = 0.1f; //f �ʼ�
//		System.out.println(f);
//		
//		double d = 0.1d; //d ��������. �Ǽ��� �⺻������ double���� ���
//		System.out.println(d);
//		
//		double d2 = 3.141592;
//		System.out.println(d2);
//		System.out.printf("%.2f\n", d2); // %d ����, %f �Ǽ�
		
		// ������ �ۼ� ��Ģ
		// ���Ǿ� �Ұ�(double, if, for ��)
		// ���ڷ� �����ϸ� �ȵ�
		// Ư�����ڵ� �Ϻθ� ���($, _)
		// 1. ī�� ǥ��� (camel case) : dailyUser // �ڹ��� ����
		// 2. �Ľ�Į ǥ��� (pascal case) : DailyUser 
		// 3. ������ũ ǥ��� (snake case) : daily_user , ��Ȧ ǥ��� (pothole case)
		// 4. �밡���� ǥ��� : intDailyUser (����Ÿ���� ����)
		// 5. Ŀ���� : ��Ģ�� ���Ѵ�
		
		// ��� : ���� ���� �Ұ����� ����
		// final�� ���̰� �빮�� �̸��� ����� const�� ����
		
//		final double PI = 3.14;
		//PI = 2.34; //error
		
		// ������ ���� �ʱ�ȭ �ؼ� ����ؾ� �Ѵ�
//		int x; // ���� ����
//		x = 10; // ������ �ʱ�ȭ
//		
//		int x = 10; // ����� �ʱ�ȭ�� ���ÿ�
//		
//		int x,y,z; // �������� ������ ����
//		x = 10;
//		y = 20;
//		z = 30; // �ʱ�ȭ�� ���� ������ 
//	
//		int x = 10, y = 20, z = 30; // �������� ����� �ʱ�ȭ�� ���ÿ�
		
		// ������ �⺻��
		// boolean false
		// byte, short, int 0
		// long 0L
		// char ''
		// float 0.0f
		// double 0.0d
		// String null
				
		// ������
		// ���ڿ� : �ѱ��� �̻�
//		String str = "Yes, my lord";
//		System.out.println(str);
		
		
		// ����ȯ
		// boolean Ÿ�� ����
		// �ڵ� ����ȯ, ����(����) ����ȯ
		
		// �ڵ� ����ȯ ---->
		// byte < short < int < long < float < double < char
		// ���� ����ȯ <----
		// 8��Ʈ -> 1����Ʈ
		
//		int i;
//		byte b = 10;
//		i = b; // �ڵ� ����ȯ
//		System.out.println(i);
		
//		int i = 10;
//		System.out.println(i);
//		
//		double d = i;
//		System.out.println(d);
		
//		int i = 10;
//		byte b;
//		b = (byte)i; // casting
//		System.out.println(b);
//		i = (int)85.2; // ��������ȯ (���� �ս�)
//		System.out.println(i);
		
		// byte - char, short - char casting �ʿ�
		// a - 97, A - 65
//		short s = 97;
//		char c = (char)97;
//		System.out.println(c);

		//�������� ������ int������ �۰ų� ������ ����� int���̴�
//		byte b = 10;
//		short s = 20;
//		
//		int sum = b + s;
//		System.out.println(sum);
//		
//		short sum2 = (short)(b + s);
//		System.out.println(sum2);
		
		// �̸��� �۸��ؾ��ϴ� ��� 3����
		// 1. ���� : dailyUser (camel case)
		// 2. Ŭ������ : DailyUser (pascal case)
		// 3. �Լ��� : dailyUser() (camel case)
	}

}
