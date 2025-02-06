import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) { // 2.6

		Calendar today = Calendar.getInstance();
		// Calendar는 추상 클래스
		
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH) + 1);      // 0 ~ 11
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));   // 연도 주수
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));  // 월 주수
		
		// 같은 값
		System.out.println(today.get(Calendar.DATE)); 
		System.out.println(today.get(Calendar.DAY_OF_MONTH));   // 월 일수
		
		System.out.println(today.get(Calendar.DAY_OF_YEAR));    // 연도 일수
		System.out.println(today.get(Calendar.DAY_OF_WEEK));    // 1 == 일요일 ~ 7 == 토요일
				
		System.out.println(today.get(Calendar.AM_PM));          // 0 = AM, 1 = PM
		System.out.println(today.get(Calendar.HOUR));           // 12시간 표기
		System.out.println(today.get(Calendar.HOUR_OF_DAY));    // 24시간 표기
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		
		System.out.println(today.getActualMaximum(Calendar.DATE)); // 실행시 해당 달의 마지막 날짜
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal); // 그레고리한 캘린더
		
		cal.set(1993, 4, 15);    // 날짜 설정, 오버라이딩 되어있다. 입력 4월 출력 4월로 나오지만, 실제로는 5월로 인식
		System.out.println(cal);
		
		
	}

}
