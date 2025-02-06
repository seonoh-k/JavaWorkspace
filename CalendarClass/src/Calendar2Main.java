import java.util.Calendar;

public class Calendar2Main {

	public static void main(String[] args) { // 2.6

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		final String[] DAY_OF_WEEK = {"", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		
		date1.set(2023, 8, 15);
		System.out.println("Input Date is " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
		// data1.get(Calendar.DAY_OF_WEEK)�� ���� ���� ���� �޾ƿ´�.
		
		System.out.println("Today is " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);
		
		// �ð� ���� �и��ʷ� ��� : ���� ��¥�� �и��� - �Է��� ��¥�� �и���
		// 24�ð� �и��� = (24 * 60 * 60 * 1000)
		long diff = date2.getTimeInMillis() - date1.getTimeInMillis();
		long diff2 = (date2.getTimeInMillis() / (24 * 60 * 60 * 1000)) - (date1.getTimeInMillis() / (24 * 60 * 60 * 1000));
		
		System.out.println("date1 ���� date2 ������ �ð����� : " + diff);
		System.out.println("date1 ���� date2 ������ �ϼ��� : " + diff2);
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " 
				+ date.get(Calendar.DATE) + "�� ";
	}

}
