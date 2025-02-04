
public class Variable {

	public static void main(String[] args) {
		// 기본형(8개)
		// 논리, 숫자(정수, 실수), 문자(한글자)
		// 논리 : boolean
		// 정수 : byte(-128 ~ 127), short(-32768 ~ 32767), int, long
		// 문자 : cahr
		// 실수 : float, double
		
		// 변수 형식 : 타입 변수명 
		
//		boolean bn = false; // false, true
//		System.out.println(bn);
//		
//		byte b = 10;
//		System.out.println(b);
//		
//		short s = 10;
//		System.out.println(s);
//		
//		int i = 10; //정수는 기본형으로 int형을 사용
//		System.out.println(i);
//		
//		long l = 10L;
//		System.out.println(l);
//		
//		char c = 'A';
//		System.out.println(c);
//		System.out.println((int)c);
//		
//		float f = 0.1f; //f 필수
//		System.out.println(f);
//		
//		double d = 0.1d; //d 생략가능. 실수는 기본형으로 double형을 사용
//		System.out.println(d);
//		
//		double d2 = 3.141592;
//		System.out.println(d2);
//		System.out.printf("%.2f\n", d2); // %d 정수, %f 실수
		
		// 변수명 작성 규칙
		// 예악어 불가(double, if, for 등)
		// 숫자로 시작하면 안됨
		// 특수문자도 일부만 허용($, _)
		// 1. 카멜 표기법 (camel case) : dailyUser // 자바의 형식
		// 2. 파스칼 표기법 (pascal case) : DailyUser 
		// 3. 스네이크 표기법 (snake case) : daily_user , 팟홀 표기법 (pothole case)
		// 4. 헝가리안 표기법 : intDailyUser (변수타입을 포함)
		// 5. 커스텀 : 규칙을 정한다
		
		// 상수 : 값의 변경 불가능한 변수
		// final을 붙이고 대문자 이름을 만든다 const와 같음
		
//		final double PI = 3.14;
		//PI = 2.34; //error
		
		// 변수는 값을 초기화 해서 사용해야 한다
//		int x; // 변수 선언
//		x = 10; // 변수의 초기화
//		
//		int x = 10; // 선언과 초기화를 동시에
//		
//		int x,y,z; // 여러개의 변수를 선언
//		x = 10;
//		y = 20;
//		z = 30; // 초기화는 각각 나눠서 
//	
//		int x = 10, y = 20, z = 30; // 여러개의 선언과 초기화를 동시에
		
		// 변수의 기본값
		// boolean false
		// byte, short, int 0
		// long 0L
		// char ''
		// float 0.0f
		// double 0.0d
		// String null
				
		// 참조형
		// 문자열 : 한글자 이상
//		String str = "Yes, my lord";
//		System.out.println(str);
		
		
		// 형변환
		// boolean 타입 제외
		// 자동 형변환, 강제(수동) 형변환
		
		// 자동 형변환 ---->
		// byte < short < int < long < float < double < char
		// 강제 형변환 <----
		// 8비트 -> 1바이트
		
//		int i;
//		byte b = 10;
//		i = b; // 자동 형변환
//		System.out.println(i);
		
//		int i = 10;
//		System.out.println(i);
//		
//		double d = i;
//		System.out.println(d);
		
//		int i = 10;
//		byte b;
//		b = (byte)i; // casting
//		System.out.println(b);
//		i = (int)85.2; // 강제형변환 (값의 손실)
//		System.out.println(i);
		
		// byte - char, short - char casting 필요
		// a - 97, A - 65
//		short s = 97;
//		char c = (char)97;
//		System.out.println(c);

		//정수형의 연산은 int형보다 작거나 같으면 결과는 int형이다
//		byte b = 10;
//		short s = 20;
//		
//		int sum = b + s;
//		System.out.println(sum);
//		
//		short sum2 = (short)(b + s);
//		System.out.println(sum2);
		
		// 이름을 작명해야하는 경우 3가지
		// 1. 변수 : dailyUser (camel case)
		// 2. 클래스명 : DailyUser (pascal case)
		// 3. 함수명 : dailyUser() (camel case)
	}

}
