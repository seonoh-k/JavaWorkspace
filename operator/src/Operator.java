
public class Operator {

	public static void main(String[] args) {
		// ���� ������ 
		// ���� ������ (�켱 ���� ����)
		// ++, --
//		int x = 10;
//		x++; // ++x
//		System.out.println(x);
//		x--; // --x
//		System.out.println(x);
		
//		int x = 10;
//		int y;
		
//		y = ++x + 10; // ���� ���� �� ��� ����
//		System.out.println(y); // 21
//		System.out.println(x); // 11

//		y = x-- + 10; // ��� ���� �� ���� ����
//		System.out.println(y); // 20
//		System.out.println(x); // 9
		
		
		// ��� ������
		// + - * / %
//		int x, y;
//		x = 11;
//		y = 2;
//		System.out.println("�� : " + x/y); // ��
//		System.out.println("������ : " + (double)x%y); // ������
		
//		int sum = 0;
//		long sum1 = 0;
//		sum = 1000000 * 1000000; // int�� �޾Ƶ��� �� �ִ� ������ �ʰ�
//		System.out.println(sum);
//		sum1 = 1000000l * 1000000; // long Ÿ������ ��ȯ�Ͽ� ��������� ������� int
//		System.out.println(sum1);
		
//		double pi = 3.141592;
		
		// 1. pi = pi * 1000 = 3141.592
		// 2. pi = (int)(pi + 0.5) = (int)(3141.592 + 0.5) = 3142 ���������� ��ȯ �߱� ������ �Ҽ��� ���� �κ��� ������
		// 3. pi = (double)(pi / 1000) or pi / 1000.0 = 3.142 ���� �Ǽ������� ��ȯ
		
//		pi = (int)(pi * 1000 + 0.5) / 1000.0; // ���ٷ� ǥ��
//		System.out.println(pi);
		
		// �� ������
		// < > <= => == !=
		// �� ���� ��� : true, false
		
//		int x = 10;
//		int y = 20;
//		System.out.println(x == y);
//		System.out.println(x != y);
		
//		float f = 0.1f;
//		double d = 0.1;
//		
//		System.out.println(f == d); // float ���� double ������ ��ȯ �Ǹ鼭 ��Ʈ���� �޶��� ���� ���� �ƴϴ�
		
		// �� ������
		// �ΰ��� �̻��� ������ �Ǵ��ϱ� ���� ���
		// & && | || !
		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x == 10 && y == 20);
//		System.out.println(x != 10 && y == 20);
//		
//		System.out.println(x == 10 || y == 20);
//		System.out.println(x == 10 || y != 20);
//		System.out.println(x != 10 || y != 20);
//		
//		System.out.println(!false);

		// �ִ���
		// ���� �������� ���� ����� ������� ������ �Ǵ� ���
		
//		int x = 5; 
//		
//		System.out.println(x >= 1 && x <= 10);
//		System.out.println(x < 1 || x > 10);
		
//		char c = 'f';
//		
//		System.out.println(c >= 'a' && c <= 'z');
//		System.out.println(c >= 97 && c <= 119);

		// ��Ʈ ������ ���� �� �볻 ������

		
		// ���� ������
		// ������ ���� �ִ� ������
		// = += -= *= /= %= ...
		
//		int x = 10;
//		// x += 10; => x = x + 10;
//		x += 10;
//		
//		System.out.println(x);		
		
		// ��Ÿ ������
		// ���� ������
		// ���ǽ�(true/false)? true���1 : false���2 
//		int x = 10;
//		int y = 20;
//		
//		int max = (x > y) ? x : y;
//		System.out.println(max);
		
//		int x, y, z;
//		x = 10;
//		y = 50;
//		z = 20;
//		
//		int max = (x > y) ? ((x > z) ? x : z) : (y > z) ? y : z;
//		  (���ǽ�) ? (���1(���ǽ�) ? ���3 : ���4) : ���2(���ǽ�) ? ���5 : ���6;
//		
//		System.out.println(max);
	}

}
