import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatMain {

	public static void main(String[] args) { // 2.6
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		
		cal.set(1993,3,15);
		System.out.println(cal);
		
		Date day = cal.getTime(); // 반환타입이 Date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss");
		// y : 연도, M : 달, d : 날짜, E : 요일, H : 시간, m : 분, s: 초
		
		System.out.println(sdf.format(day)); // 클래스 타입이 달라서 캐스팅했다
		
	}

}
