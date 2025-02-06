import java.util.Calendar;
import java.util.Scanner;

public class Calendar4Main {

	public static void main(String[] args) { // 2.6

		// �޷� ���α׷� �ۼ�
		// 1���� �����ϴ� ������ Ȯ��
		// ������ ��¥ Ȯ��
		// ù° ���� ���ڸ� ��� ǥ���� ���ΰ�
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		Calendar rDay = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int month;
		int END_DAY = 0;
		int START_DAY_WEEK = 0;
		int RDAY = 0;
		int END_DAY_WEEK = 0;
		
		System.out.println("���� �Է� : ");
		year = sc.nextInt();
		
		System.out.println("�� �Է� : ");
		month = sc.nextInt();
		sc.close();
		
		sDay.set(year, month-1, 1);
		System.out.println(toString(sDay));
		
		eDay.set(year, month, 1); // sDay�� �Ѵ� ��
		System.out.println(toString(eDay));
		
		
		eDay.add(Calendar.DATE, -1); // �Ϸ縦 ���� sDay ���� ������ ��¥.
		END_DAY = eDay.get(Calendar.DATE); // ������ ��¥�� ����
		
		START_DAY_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // ���� ���� ����
		END_DAY_WEEK = eDay.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "�� " + month + "�� ");
		System.out.println(" SU MO TU WE TU FR SA ");
		
		rDay.set(year, month-1, 1);
		rDay.add(Calendar.DATE, -(START_DAY_WEEK - 1));
		RDAY = rDay.get(Calendar.DATE);
		
		for(int i=1, r=RDAY; i<START_DAY_WEEK; i++,r++) {
//			System.out.print("   "); // ��~�� �� ������ �� �κ�
			System.out.print(r < 10? "  " + r : " " + r);
		}
		
		for(int i=1, n=START_DAY_WEEK; i<=END_DAY; i++,n++) {
			System.out.print(i < 10? "  " + i : " " + i); // i�� 10 �̸��� ��� ���� ��ĭ
			if(n % 7 == 0) { // n�� 7�� ����� �Ǹ� �� ���
				System.out.println();
			}
			
		}
		
		for(int i=END_DAY_WEEK, a=1; i<=END_DAY_WEEK; i++, a++) {
			if(a % 7 == 0) {
				System.out.print(a < 10? "  " + a : " " + a);				
				break;
			}else {
				System.out.print(a < 10? "  " + a : " " + a);				
			}
		}
		
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " 
				+ date.get(Calendar.DATE) + "�� ";
	}

}
