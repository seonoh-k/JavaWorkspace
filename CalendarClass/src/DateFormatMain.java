import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatMain {

	public static void main(String[] args) { // 2.6
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		
		cal.set(1993,3,15);
		System.out.println(cal);
		
		Date day = cal.getTime(); // ��ȯŸ���� Date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� HH:mm:ss");
		// y : ����, M : ��, d : ��¥, E : ����, H : �ð�, m : ��, s: ��
		
		System.out.println(sdf.format(day)); // Ŭ���� Ÿ���� �޶� ĳ�����ߴ�
		
	}

}
