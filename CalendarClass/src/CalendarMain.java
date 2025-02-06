import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) { // 2.6

		Calendar today = Calendar.getInstance();
		// Calendar�� �߻� Ŭ����
		
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH) + 1);      // 0 ~ 11
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));   // ���� �ּ�
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));  // �� �ּ�
		
		// ���� ��
		System.out.println(today.get(Calendar.DATE)); 
		System.out.println(today.get(Calendar.DAY_OF_MONTH));   // �� �ϼ�
		
		System.out.println(today.get(Calendar.DAY_OF_YEAR));    // ���� �ϼ�
		System.out.println(today.get(Calendar.DAY_OF_WEEK));    // 1 == �Ͽ��� ~ 7 == �����
				
		System.out.println(today.get(Calendar.AM_PM));          // 0 = AM, 1 = PM
		System.out.println(today.get(Calendar.HOUR));           // 12�ð� ǥ��
		System.out.println(today.get(Calendar.HOUR_OF_DAY));    // 24�ð� ǥ��
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		
		System.out.println(today.getActualMaximum(Calendar.DATE)); // ����� �ش� ���� ������ ��¥
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal); // �׷����� Ķ����
		
		cal.set(1993, 4, 15);    // ��¥ ����, �������̵� �Ǿ��ִ�. �Է� 4�� ��� 4���� ��������, �����δ� 5���� �ν�
		System.out.println(cal);
		
		
	}

}
