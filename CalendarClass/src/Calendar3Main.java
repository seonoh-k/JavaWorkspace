import java.util.Calendar;

public class Calendar3Main {

	public static void main(String[] args) { // 2.6

		// Ķ���� Ŭ������ ����� ���
		Calendar date = Calendar.getInstance();
		
		date.set(2000, 5, 3);
		
		System.out.println(toString(date));
		
		System.out.println("== 1�� �� ==");
		date.add(Calendar.DATE, 1); // 1���� ���Ѵ�
		System.out.println(toString(date));
		
		System.out.println("== 6���� �� ==");
		date.add(Calendar.MONTH, -6); // �� ���� ���� �Է�
		System.out.println(toString(date));
		
		System.out.println("== 31�� �� ==");
		date.roll(Calendar.DATE, 31); // roll : ������ �Ǵ� ���� ���� date�� �ѹ��� ���Ƽ� ���� ���� �ȴ�.
		System.out.println(toString(date));
		
		System.out.println("== 31�� �� ==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " 
				+ date.get(Calendar.DATE) + "�� ";
	}

}
