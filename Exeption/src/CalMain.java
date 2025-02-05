import java.util.InputMismatchException;
import java.util.Scanner;

public class CalMain { // 2.5

	public static void main(String[] args) {

		int num1, num2, result = 0;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("���ڸ� �ΰ� �Է��ϼ���");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println("������ �Է� : ");
			
			oper = sc.next();
			
			if(oper.equals("+")) {
				result = num1 + num2;
			}else if(oper.equals("-")) {
				result = num1 - num2;
			}else if(oper.equals("*")) {
				result = num1 * num2;
			}else if(oper.equals("/")) {
				result = num1 / num2;
			}
			
			System.out.println("���� ��� : " + result);			
			
		}catch(InputMismatchException e) {
			System.out.println("���� ������ ����Ȯ�մϴ�.");
		}catch(NumberFormatException e) {
			System.out.println("������ �Է��ϼ���");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}catch(Exception e) {
			System.out.println("���� ������ ����Ȯ�մϴ�");
		}finally {
			sc.close();
		}
	}

}

//`InputMismatchException`�� Java�� `java.util` ��Ű���� ���� �����̱� ������ �ٸ� ���ܵ���� �ٸ��� Ư�� ��Ű���� ����Ʈ�ؾ� �մϴ�. 
//
//�ڼ��� �������ڸ�:
//
//1. **`InputMismatchException`**�� `java.util` ��Ű���� ���� Ŭ�����Դϴ�. ���� ���, `Scanner` Ŭ�������� �Է��� ���� �� �Է� ���� ������ Ÿ�԰� ���� ������ �� ���ܰ� �߻��մϴ�. �׷��Ƿ� `InputMismatchException`�� ����Ϸ��� `java.util` ��Ű���� ����Ʈ�ؾ� �մϴ�.
//
//2. **�ٸ� ���ܵ�**�� ��κ� `java.lang` ��Ű���� �⺻������ ���ԵǾ� �ֱ� ������ ���� ����Ʈ�� �ʿ䰡 �����ϴ�. ���� ���, `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` ���� ��� `java.lang` ��Ű���� ���ԵǾ� �־� �ڵ����� ���� �����մϴ�.
//
//����, `InputMismatchException`�� ���� ����Ʈ�ϴ� ������ �װ��� �ٸ� ���ܵ�� �ٸ� ��Ű���� �����ϱ� �����Դϴ�. �ݸ�, `java.lang` ��Ű���� ���Ե� ���ܵ��� �ڵ����� ����� �� �ֱ� ������ ����Ʈ�� �ʿ� ���� ���Դϴ�.
