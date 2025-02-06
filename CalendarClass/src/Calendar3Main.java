import java.util.Calendar;

public class Calendar3Main {

	public static void main(String[] args) { // 2.6

		// 캘린더 클래스의 기능을 사용
		Calendar date = Calendar.getInstance();
		
		date.set(2000, 5, 3);
		
		System.out.println(toString(date));
		
		System.out.println("== 1일 후 ==");
		date.add(Calendar.DATE, 1); // 1일을 더한다
		System.out.println(toString(date));
		
		System.out.println("== 6개월 전 ==");
		date.add(Calendar.MONTH, -6); // 뺄 때는 음수 입력
		System.out.println(toString(date));
		
		System.out.println("== 31일 후 ==");
		date.roll(Calendar.DATE, 31); // roll : 기준이 되는 값만 변경 date만 한바퀴 돌아서 같은 값이 된다.
		System.out.println(toString(date));
		
		System.out.println("== 31일 후 ==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " 
				+ date.get(Calendar.DATE) + "일 ";
	}

}
