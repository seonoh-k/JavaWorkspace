//import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// 조건문
		// if, switch
		
		// if(조건식: 결과값이 true, false) {
		//	실행문 : 조건식이 true일 때	
		//}else {
		// 실행문 : 조건식이 false일 때
		//}
		
//		int age = 10;
//		
//		if(age >= 20) {
//			System.out.println("성년입니다");
//		}else {
//			System.out.println("미성년입니다");
//		}
		
//		int x = 5;
//		if (!(x >= 1 && x <= 10)) {
//			System.out.println("범위 안에 존재하는 값입니다");
//		}else {
//			System.out.println("범위 안에 존재하지 않는 값입니다");
//		}
		
//		if(조건식) {
//			실행문1;
//		}else if(조건식) {
//			실행문2;
//		}else if(조건식) {
//			실행문3;
//		}else {
//			실행문4(앞의 조건식이 모두 부합하지 않으면 실행);
//		}
		
//		int select = 1;
//		if (select == 1) {
//			System.out.println("1번을 선택했습니다");
//		}else if (select == 2) {
//			System.out.println("2번을 선택했습니다");
//		}else if( select == 3) {
//			System.out.println("3번을 선택했습니다");
//		}else {
//			System.out.println("잘못 선택하셨습니다");
//		}
		
		
//		if(조건식) {
//			if(조건식) {
//				
//			}else {
//				
//			}
//		}else {
//			
//		}
		
//		int x = 6; //2와 3의 공배수
//		if (x%2 == 0) {
//			if (x%3 == 0) {
//				System.out.println(x + "은 2와 3의 공배수입니다");
//			}
//		}
//			
//		if ((x%2 == 0) && (x%3 == 0)) {
//			System.out.println(x + "은 2와 3의 공배수입니다");
//		}
//		
//		if (2*3 == x) {
//			System.out.println(x + "은 2와 3의 공배수입니다");
//		}
		
		// switch(비교값) { 등가연산(==), case의 값으로 실수는 사용불가
		// case 값1 : 실행문;
		// break;
		
		// case 값2 : 실행문;
		// break;
		
		// case 값3 : 실행문;
		// break;
		
		// default : 실행문; 해당하는 값이 없을 떄 실행
		// }
		
//		int sel = 1;
//		String str = "1";
//		char c = '1';
		
//		switch(sel) {
//		case 1 : System.out.println("1번 선택");
//		break;
//		
//		case 2 : System.out.println("2번 선택");
//		break;
//		
//		case 3 : System.out.println("3번 선택");
//		break;
//		
//		default : System.out.println("잘못 선택");
//		}
		
//		int score = 60;
//		if (score >= 60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
//		
//		삼항 연산자 이용
//		String result = (score >= 60)? "합격" : "불합격";
//		System.out.println(result);
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요 : ");
//		int num1 = scan.nextInt(); //커서가 대기
//	
//		// scan.next(); 첫번째 공백 전까지
//		scan.nextLine();
//	
//		
//		System.out.println("산술 연산자를 입력하세요 : ");
//		String str = scan.nextLine(); // 엔터치기 전까지
//		
//		System.out.println("숫자를 입력하세요 : ");
//		int num2 = scan.nextInt(); //커서가 대기
//		
//		switch(str) {
//		case "+" : System.out.println(num1 + num2);
//		break;
//		
//		case "-" : System.out.println(num1 - num2);
//		break;
//		
//		case "*" : System.out.println(num1 * num2);
//		break;
//		
//		case "/" : System.out.println(num1 / num2);
//		break;
//		}
		
		// 랜덤값 만들기
		// Math.random() : 0.0 <= r < 1
		
		//System.out.println(Math.random());
		// 1 ~ 10 = (int)(Math.random()*(난수의 최대값 - 난수의 최소값) + 1) + 난수의 최소값
		
		//System.out.println((int)(Math.random()*10)+1);
		
		//1(가위) 2(바위) 3(보)
//		int num1 = (int)(Math.random()*3) + 1;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("가위 바위 보 입력");
//		String str = scan.nextLine();
//		int me = scan.nextInt();
				
		// 문자 입력
//		switch(str) {
//		case "가위" : {
//			String result = (num1 == 1)? "COM : 가위 => 무승부" : ((num1 == 2)? "COM : 바위 => 패배" : "COM : 보 => 승리!");
//			System.out.println(result);
//		} scan.close(); break;
//		
//		case "바위" : {
//			String result = (num1 == 1)? "COM : 가위 => 승리!" : ((num1 == 2)? "COM : 바위 => 무승부" : "COM : 보 => 패배");
//			System.out.println(result);
//		} scan.close(); break;
//		
//		case "보" : {
//			String result = (num1 == 1)? "COM : 가위 => 패배" : ((num1 == 2)? "COM : 바위 => 승리!" : "COM : 보 => 무승부");
//			System.out.println(result);
//		} scan.close(); break;
//		
//		default : System.out.println("잘못 입력");
//		}
		
		// 숫자 입력
//		int result = me - num1;
//		
//		if(result == -1 || result == 2) {
//			System.out.println("승리");
//		}else if(result == 1 || result == -2) {
//			System.out.println("패배");
//		}else {System.out.println("무승부");}
		
		// 반복문
		// for, while, do-while
		
		
//		for(초기값; 조건식; 증감식) {
//			반복할 실행문;
//		}
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
//		for(int i=1; i <= 10; i+=2) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		for(int i=1,j=10; i<=10; i++,j--) {
//			System.out.println("i = " + i + ", j = " + j);
//		}
		
//		int s = 1;
//		for(int i=1; i<=10; i++,s*=-1) {
//			System.out.println(s);
//		}
		
		// 5! = 1 x 2 x 3 x 4 x 5
		
//		int sum = 1;
//		for(int i=1; i<=5; i++) {
//			sum *= i;
//		}
//		System.out.println(sum);
		
//		초기값
//		while(조건식) {
//			반복할 실행문;
//			증감식;
//		}
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
//		int i = 1;
//		int fac = 1;
//		while(i<=5) {
//			fac *= i;
//			i++;
//		}
//		System.out.println(fac);
		
		//중첩 for문
//		for(초기값;조건식;증감식) { 행
//			for(초기값;조건식;증감식) { 열
//				반복할 실행문;
//			}
//		}
		
		// *****
//		for(int i=1; i<=5; i++) {
//			System.out.print("*");
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); 줄 띄움
//		}
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		     *
//		    **
//		   ***
//		  ****
//		 *****
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=5; j++) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		// while의 중첩
		
//		*
//		**
//		***
//		****
//		*****
		
//		int i = 1;
//		
//		while(i<=5) {
//			int j = 1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(" ");
//			i++;
//		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		int i = 5;
//		while(i>=1) {
//			int j = 1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(" ");
//			i--;
//		}
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
		
//		int i = 1;
//		while(i<=5) {
//			int j = 1;
//			while(j<=5) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		int i = 5;
//		while(i>=1) {
//			int j = 1;
//			while(j<=5) {
//				if(i + j >= 6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
		// 무한 반복문
		
//		for(;true;) {
//			실행문;
//		}
		
//		while(true) {
//			실행문;
//		}
		
//		int i = 1;
//		int even = 0; //홀수
//		int odd = 0; //짝수
//		
//		while (i<=10) {
//			if(i%2 == 0) {
//				odd += i;
//			}else {
//				even += i;
//			}
//			i++;
//		}
//		System.out.println("odd : " + odd);
//		System.out.println("even : " + even);
		
//		int i = 1;
//		int sum = 0;
//		
//		while(true) {
//			if(sum > 100) {
//				break;
//				System.out.println("i : " + i + ", " + "sum : " + sum);
//			}else {
//				sum += i;
//				i++;
//			}
//			
//		}	
		
//		boolean flag = true;
//		int sum = 0;
//		int i = 1;
//		
//		while(flag) {
//			sum += i;
//			if(sum > 90 && sum < 100) { //(!(sum <= 100))으로도 가능
//				flag = false;
//				System.out.println("i : " + i + ", " + "sum : " + sum);		
//			}
//			i++;
//		}
		
//		int i = 0;
//		int sum = 0;
//		
//		while((sum += ++i) <= 100) { // if문의 조건식을 while문의 조건식에 대입함
//			System.out.println("i : " + i + ", " + "sum : " + sum);
//		}

		// 주어진 정수의 합을 구하기
		// 숫자의 자리수는 랜덤하게 주어진다.
		// ex) 12345 = 1+2+3+4+5 = 15
		
//		int sum = 0;
//		int r = (int)(Math.random()*30) + 1;
//		
//		for(int i=0; i<=r; i++) {
//			int j = (int)(Math.random()*9) + 1;
//			sum += j;
//			System.out.println("j : " + j + ", sum : " + sum);
//		}
//		System.out.println(sum);
		
		
//		int num = 12345;
//		
//		num % 10 -> 5
//		num / 10 -> 1234 이 둘을 반복하다 num이 0이 되면 반복문 종료.
		
//		int num = (int)(Math.random()*100000000)+1;
//		int sum = 0;
//		
//		while(num != 0) {
//			sum += num % 10;
//			System.out.println("num : " + num + ", sum : " + sum);
//			num /= 10;
//		}
//		System.out.println(sum);
		
		// break, continue
//		int i = 1;
//		
//		while(true) {
//			if(i > 10) {
//				break;
//			}
//			System.out.println(i + ".hello world");
//			i++;
//		}
		
//		int i = 0;
//		
//		while(i <= 10) {
//			i++;
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i + ". hello world");
//		}
		
//		do {
//			실행문
//		}while(조건식); 
		
		
//		int i = 1;
//		
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 10);
		
//		int i = 1;
//		
//		do {
//			int j = 1;
//			do {
//				System.out.print("*");
//				j++;				
//			}while(j<=i);
//			System.out.println(" ");
//			i++;
//		}while(i<=5);
		
		// 1 ~ 20 정수 중에 2 또는 3의 배수가 아닌 값의 총합
//		int sum = 0;
//		
//		for(int i=1; i<=20; i++) {
//			if(i%2 != 0 && i%3 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=20) {
//			if(i%2 != 0 && i%3 != 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
		// 1+(-2)+3(-4)+...과 같은 식으로 더해나갔을 때 몇 까지 더해야 총합이 100 이상이 되는지 구하시오
		
//		int sum = 0;
//		int s = 1; // 부호 변경을 위한 변수
//		int num = 0;
//		int i = 1;
//		
//		while(true) {
//			num = s * i;
//			sum += num;
//			
//			s = -s; // 1 -> -1 -> 1 ...
//			i++;
//			
//			if(sum >= 100) {
//				break;
//			}
//			
//		}
//		System.out.println("num : " + num);
//		System.out.println("sum : " + sum);
		
//		int i = 1;
//		int j = 0;
//		int sum = 0;
//		
//		while(true) {
//			sum = sum + i + j;
//			i += 2;
//			j -= 2;
//			if(sum >= 100) {
//				break;
//			}
//		}
//		System.out.println("i : " + i + ", j : " + j + ", sum : " + sum); 
		// sum = 100에서 반복문이 멈추기는 하지만 위와 같이 몇을 더했을 때 100이 나오는지 알 수 없음
		
		
		// 방정식 2x + 4y = 10의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.
		
//		for(int x=0; x<=10; x++) {
//			for(int y=0; y<=10; y++) {
//				if((x * 2) + (y * 4) == 10) {
//					System.out.println("x : " + x + ", y : " + y);
//				}
//			}
//		}
		
//		int number = 12345; 	// 12345 -> 54321
//		int number = (int)(Math.random()*10000000)+1;
//		int r = 0;
//		
//		System.out.println(number);
//		while(number != 0) {
//			r = r * 10 + number % 10;
//			System.out.println("number : " + number + ", r : " + r);
//			number /= 10;
//		}
//		System.out.println(r);
		
//		int number = 12321;
//		int sum = number;
//		int r = 0;
//		
//		while(sum != 0) {
//			r = r * 10 + sum % 10;
//			System.out.println("sum : " + sum + ", r : " + r);
//			sum /= 10;
//		}
//		if(number == r) {
//			System.out.println("number : " + number + ", r : " + r);
//			System.out.println("회문입니다.");
//		}else {
//			System.out.println("number : " + number + ", r : " + r);
//			System.out.println("회문이 아닙니다.");
//		}
		
		
		
	}

}
