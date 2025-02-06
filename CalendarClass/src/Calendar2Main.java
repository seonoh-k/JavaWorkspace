import java.util.Calendar;

public class Calendar2Main {

	public static void main(String[] args) { // 2.6

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		final String[] DAY_OF_WEEK = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		date1.set(2023, 8, 15);
		System.out.println("Input Date is " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
		// data1.get(Calendar.DAY_OF_WEEK)를 통해 요일 값을 받아온다.
		
		System.out.println("Today is " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);
		
		// 시간 차를 밀리초로 계산 : 현재 날짜의 밀리초 - 입력한 날짜의 밀리초
		// 24시간 밀리초 = (24 * 60 * 60 * 1000)
		long diff = date2.getTimeInMillis() - date1.getTimeInMillis();
		long diff2 = (date2.getTimeInMillis() / (24 * 60 * 60 * 1000)) - (date1.getTimeInMillis() / (24 * 60 * 60 * 1000));
		
		System.out.println("date1 부터 date2 까지의 시간차는 : " + diff);
		System.out.println("date1 부터 date2 까지의 일수는 : " + diff2);
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " 
				+ date.get(Calendar.DATE) + "일 ";
	}

}
