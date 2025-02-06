import java.util.Calendar;
import java.util.Scanner;

public class Calendar4Main {

	public static void main(String[] args) { // 2.6

		// 달력 프로그램 작성
		// 1일이 시작하는 요일을 확인
		// 마지막 날짜 확인
		// 첫째 주의 숫자를 어떻게 표현할 것인가
		
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
		
		System.out.println("연도 입력 : ");
		year = sc.nextInt();
		
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		sc.close();
		
		sDay.set(year, month-1, 1);
		System.out.println(toString(sDay));
		
		eDay.set(year, month, 1); // sDay의 한달 뒤
		System.out.println(toString(eDay));
		
		
		eDay.add(Calendar.DATE, -1); // 하루를 빼면 sDay 달의 마지막 날짜.
		END_DAY = eDay.get(Calendar.DATE); // 마지막 날짜를 대입
		
		START_DAY_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 요일 정보 대입
		END_DAY_WEEK = eDay.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 ");
		System.out.println(" SU MO TU WE TU FR SA ");
		
		rDay.set(year, month-1, 1);
		rDay.add(Calendar.DATE, -(START_DAY_WEEK - 1));
		RDAY = rDay.get(Calendar.DATE);
		
		for(int i=1, r=RDAY; i<START_DAY_WEEK; i++,r++) {
//			System.out.print("   "); // 일~토 중 공백이 들어갈 부분
			System.out.print(r < 10? "  " + r : " " + r);
		}
		
		for(int i=1, n=START_DAY_WEEK; i<=END_DAY; i++,n++) {
			System.out.print(i < 10? "  " + i : " " + i); // i가 10 미만인 경우 공백 두칸
			if(n % 7 == 0) { // n이 7의 배수가 되면 줄 띄움
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
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " 
				+ date.get(Calendar.DATE) + "일 ";
	}

}
