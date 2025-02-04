
public class Operator {

	public static void main(String[] args) {
		// 단항 연산자 
		// 증감 연산자 (우선 순위 높음)
		// ++, --
//		int x = 10;
//		x++; // ++x
//		System.out.println(x);
//		x--; // --x
//		System.out.println(x);
		
//		int x = 10;
//		int y;
		
//		y = ++x + 10; // 증감 연산 뒤 산술 연산
//		System.out.println(y); // 21
//		System.out.println(x); // 11

//		y = x-- + 10; // 산술 연산 뒤 증감 연산
//		System.out.println(y); // 20
//		System.out.println(x); // 9
		
		
		// 산술 연산자
		// + - * / %
//		int x, y;
//		x = 11;
//		y = 2;
//		System.out.println("몫 : " + x/y); // 몫
//		System.out.println("나머지 : " + (double)x%y); // 나머지
		
//		int sum = 0;
//		long sum1 = 0;
//		sum = 1000000 * 1000000; // int가 받아들일 수 있는 범위를 초과
//		System.out.println(sum);
//		sum1 = 1000000l * 1000000; // long 타입으로 변환하여 계산하지만 결과값은 int
//		System.out.println(sum1);
		
//		double pi = 3.141592;
		
		// 1. pi = pi * 1000 = 3141.592
		// 2. pi = (int)(pi + 0.5) = (int)(3141.592 + 0.5) = 3142 정수값으로 변환 했기 때문에 소수점 이하 부분이 버려짐
		// 3. pi = (double)(pi / 1000) or pi / 1000.0 = 3.142 재차 실수값으로 변환
		
//		pi = (int)(pi * 1000 + 0.5) / 1000.0; // 한줄로 표현
//		System.out.println(pi);
		
		// 비교 연산자
		// < > <= => == !=
		// 논리 값이 결과 : true, false
		
//		int x = 10;
//		int y = 20;
//		System.out.println(x == y);
//		System.out.println(x != y);
		
//		float f = 0.1f;
//		double d = 0.1;
//		
//		System.out.println(f == d); // float 값이 double 값으로 변환 되면서 비트값이 달라짐 같은 값이 아니다
		
		// 논리 연산자
		// 두가지 이상의 조건을 판단하기 위해 사용
		// & && | || !
		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x == 10 && y == 20);
//		System.out.println(x != 10 && y == 20);
//		
//		System.out.println(x == 10 || y == 20);
//		System.out.println(x == 10 || y != 20);
//		System.out.println(x != 10 || y != 20);
//		
//		System.out.println(!false);

		// 최단평가
		// 앞의 연산결과가 뒤의 연산과 상관없이 결정이 되는 방식
		
//		int x = 5; 
//		
//		System.out.println(x >= 1 && x <= 10);
//		System.out.println(x < 1 || x > 10);
		
//		char c = 'f';
//		
//		System.out.println(c >= 'a' && c <= 'z');
//		System.out.println(c >= 97 && c <= 119);

		// 비트 연산자 몰라도 됨 쥰내 복잡함

		
		// 대입 연산자
		// 변수에 값을 넣는 연산자
		// = += -= *= /= %= ...
		
//		int x = 10;
//		// x += 10; => x = x + 10;
//		x += 10;
//		
//		System.out.println(x);		
		
		// 기타 연산자
		// 삼항 연산자
		// 조건식(true/false)? true결과1 : false결과2 
//		int x = 10;
//		int y = 20;
//		
//		int max = (x > y) ? x : y;
//		System.out.println(max);
		
//		int x, y, z;
//		x = 10;
//		y = 50;
//		z = 20;
//		
//		int max = (x > y) ? ((x > z) ? x : z) : (y > z) ? y : z;
//		  (조건식) ? (결과1(조건식) ? 결과3 : 결과4) : 결과2(조건식) ? 결과5 : 결과6;
//		
//		System.out.println(max);
	}

}
