import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		// 배열 : 여러 개의 값을 한번에 저장하기 위한 공간
		// 종류 : 일차원 배열, 다차원 배열
		
//		int a,b,c,d,e; // 변수 선언
//		a = 1;		   // 초기화
//		b = 2;
//		c = 3;
//		d = 4;
//		e = 5;
		// 변수 이름 : 주소값
		
		// 일차원 배열 형식 : 변수타입 변수이름[]; 
		
//		int arr[]; 		  // 배열의 선언		
//		arr = new int[5]; // 배열이 생성
		
//		int arr[] = new int[5]; // 주로 사용하는 형식. 배열의 선언과 생성을 동시에
		
//		int arr[] = {1, 2, 3, 4, 5};  // 배열의 선언, 생성, 초기화를 동시에
		
//		arr[0] = 1; 	  // 배열의 초기화
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		System.out.println(arr.length); // 배열의 크기
		
		// 배열은 순차 처리하기 위한 것이 주 목적으로 반복문을 사용하는 것이 좋다.
		
//		int arr[] = new int[10];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
//		
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
		
//		int odd = 0;  // 홀수
//		int even = 0; //짝수
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2 == 0) {
//				even += arr[i];
//			}else {
//				odd += arr[i];
//			}
//		}
//		System.out.println("짝수의 합 : " + even);
//		System.out.println("홀수의 합 : " + odd);
		
//		char c[] = new char[26];
//		
//		for(int i=0; i<c.length; i++) {
//			c[i] += i + 97; // 97 : 'a'도 가능
//			System.out.println(c[i]);
//		}
		// a = 97 A = 65
		
		// 배열의 복사
//		int arr1[] = {1,2,3,4,5};
//		int arr2[] = new int[5];
//		
//		System.out.println("복사 전 값");
//		System.out.println(Arrays.toString(arr2)); // 배열 값만 확인 [0,0,0,0,0]
//		
//		for(int i=0; i<arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		
//		System.out.println("복사 후 값");
//		System.out.println(Arrays.toString(arr2)); // [1,2,3,4,5]
		
//		int arr1[] = {1,2,3,4,5};
//		int arr2[] = new int[5];
		
		// System.arraycopy(값을 가진 배열, 시작 위치 인덱스 번호, 값을 받을 배열, 시작 위치 인덱스 번호, 크기(복사할 값의 개수))
		
//		System.out.println("복사 전 값");
//		System.out.println(Arrays.toString(arr2));
//		
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		System.arraycopy(arr1, 3, arr2, 3, 2);
//		
//		System.out.println("복사 후 값");
//		System.out.println(Arrays.toString(arr2));
		
//		int arr1[] = {1,2,3,4,5};
//		int arr2[] = new int[5];
//		
//		System.out.println("복사 전 값");
//		System.out.println(Arrays.toString(arr2));
//		
//		arr2 = Arrays.copyOf(arr1, 5);
//		
//		System.out.println("복사 후 값");
//		System.out.println(Arrays.toString(arr2));
		
//		System.out.println(arr1); // 주소값 [I@53bd815b을 가진다. 배열이 저장된 위치.
		
//		int score[] = {100, 88, 100, 100, 90};
//		int sum = 0;
//		double avg = 0.0;
//		
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];
//		}
//		avg = (double)sum / score.length;
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
		
//		int score[] = {79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		
//		for(int i=1; i<score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];				
//			}else if(score[i] < min) {
//				min = score[i];				
//			}
//			
//		}
//		System.out.println("최대 값 : " + max);
//		System.out.println("최소 값 : " + min);
		
//		int x = 10;
//		int y = 20;
//		int tmp = 0;
//		
//		tmp = x;
//		x = y;
//		y = tmp;
		
//		int arr[] = {1,2,3,4,5};
//		System.out.println(Arrays.toString(arr));
//		
//		int tmp;
//		tmp = arr[0];
//		arr[0] = arr[2];
//		arr[2] = tmp;
//		System.out.println(Arrays.toString(arr));
		
//		int arr[] = {1,2,3,4,5};
//		
//		for(int i=0; i<=100; i++) {
//			int x = (int)(Math.random()*5);
//			int y = (int)(Math.random()*5);
//			
//			int tmp;
//			tmp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = tmp;
//			System.out.println(i + " : " + Arrays.toString(arr));
//		}
		
//		// 로또 
//		int lotto[] = new int[45];
//		
//		// 1 ~ 45 초기화
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(lotto));
//		
//		// 앞에서부터 6개의 숫자를 출력
//		for(int i=0; i<6; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
//		
//		// lotto 배열을 100회 스왑한다.
//		for(int i=0; i<=100; i++) {
//			int x = (int)(Math.random()*45);
//			int y = (int)(Math.random()*45);
//			
//			int tmp;
//			tmp = lotto[x];
//			lotto[x] = lotto[y];
//			lotto[y] = tmp;
//		}
//		
//		// 앞에서부터 6개의 숫자를 출력
//		for(int i=0; i<6; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
//		
//		// 랜덤한 6개의 숫자를 출력
//		for(int i=0; i<6; i++) {
//			int x = (int)(Math.random()*45);
//			System.out.print(lotto[x] + " ");
//		}
		
//		int lotto[] = new int[6];
//		
//		for(int i=0; i<lotto.length; i++) {
//			int x = (int)(Math.random()*45)+1;
//			lotto[i] = x;	
//		}
//		System.out.println(Arrays.toString(lotto));
//		
//		for(int i=0; i<lotto.length; i++) {
//			for(int j=i+1; j<lotto.length; j++) {
//				if(lotto[i] == lotto[j]) {
//					lotto[j] = (int)(Math.random()*45)+1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
//		
//		for(int i=0; i<lotto.length; i++) {
//			int x = (int)(Math.random()*45)+1;
//			lotto[i] = x;
//			for(int j=0; j<i; j++) { // 배열 전체의 중복값을 찾아야하기 때문에 j=0으로 한다.
//				if(lotto[i] == lotto[j]) {
//					i--; // 중복값이 나왔을 때 i를 1 감소해서 같은 자리에 난수를 한번 더 입력하고 다시 비교한다.
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
		
		// 정렬 : 오름차순, 내림차순
		
//		int sort[] = {5,2,3,1,4};
//		
//		System.out.println("정렬 전");
//		System.out.println(Arrays.toString(sort));
//		
//		for(int i=0; i<sort.length; i++) {
//			for(int j=i+1; j<sort.length; j++) {
//				if(sort[i] > sort[j]) {
//					int tmp;
//					tmp = sort[i];
//					sort[i] = sort[j];
//					sort[j] = tmp;
//				}
//			}
//		}
//		System.out.println("정렬 후");
//		System.out.println(Arrays.toString(sort));
		
//		String names[] = new String[3];
//		
//		names[0] = "kim";
//		names[1] = "park";
// 		names[2] = "choi";
// 		
// 		System.out.println(Arrays.toString(names));
//		
// 		for(int i=0; i<names.length; i++) {
// 			System.out.println(names[i]);
// 		}
// 		
// 		System.out.println("==향상된 for문==");
// 		
// 		for(String Name : names) {
// 			System.out.println(Name);
// 		}
		
//		int arr[] = {1,2,3,4,5};
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("==향상된 for문==");
//		
//		//for( of ){ } js.
//		for(배열과 같은 타입의 변수선언 : 배열변수 or 객체변수) { } 읽기에만 사용
//		for(int Arr : arr) {
//			System.out.println(Arr);
//		}
 		
		// 이차원 배열
//		int arr[][]; // 배열의 선언 int[][] arr; 가능
//		arr = new int[5][3]; // 배열의 생성 [행 크기][열 크기]
		
//		int arr[][] = new int[5][3];
		
//		int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		
//		arr[4][0] = 13;
//		arr[4][1] = 14;
//		arr[4][2] = 15;
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[4][2]);
				
//		System.out.println(arr); // 주소값 [[I@53bd815b   arr.length 행의 크기
//		System.out.println(arr[0]); // 주소값 [I@2401f4c3 arr[0].length 열의 크기
		
//		int arr[][] = new int[5][3];
//		int num = 1;
//		
//		for(int i=0; i<arr.length; i++) {		  // 행의 크기만큼 반복
//			for(int j=0; j<arr[i].length; j++) {  // 열의 크기만큼 반복
//				arr[i][j] = 3 * i + 1 + j;
//				System.out.print("arr[" + i + "][" + j + "] : " + arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int row[] : arr) { // row[]에 행의 주소값 대입
//			for(int num : row) { // num에 열의 주소값 대입
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
		
		
		// 책 예시
//		int numbers[] = {1,2,3,4,5};
//		for(int number: numbers) {
//			System.out.println(number);
//		} 배열 numbers의 각 index를 변수 number에 순차적으로 대입해서 출력
		
//		int scores[] = {80, 90, 70, 85, 95};
//		
//		double avg = 0;
//		for(int i=0; i<scores.length; i++) {
//			avg += scores[i];
//		}
//		avg /= scores.length;
//		System.out.println(avg);
		
//		String cars[] = {"Volvo", "BMW", "Ford", "Hyundai"};
//		for(String i:cars) {
//			System.out.println(i);
//		} 배열 cars의 각 index를 변수 i에 순차적으로 대입해서 출력
		
//		int myNumbers[][] = {{1,2,3,4}, {5,6,7}};
		// { {0}, {1} } ->  {{0,1,2,3}, {0,1,2}}
//		System.out.println(myNumbers[0][0]);
//		myNumbers[0][0] = 9;
//		System.out.println(myNumbers[0][0]);
//		System.out.println("=================");
//		System.out.println(myNumbers[1][2]);
//		myNumbers[1][2] = 88;
//		System.out.println(myNumbers[1][2]);
		
//		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		for(int i=0; i<matrix.length; i++) {
//			for(int j=0; j<matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// Study 객체를 생성
//		class Study{
//			private String name;
//			
//			public Study(String name) {
//				this.name = name;
//			}
//			
//			public String getName() {
//				return name;
//			}
//		}
//		
//		Study subject[] = new Study[3]; // Study 객체를 참조하는 배열 생성
//
//		subject[0] = new Study("math"); // 객체 생성 후 배열에 할당
//		subject[1] = new Study("science");
//		subject[2] = new Study("eng");
//		
//		for(Study study: subject) {
//			System.out.println(study.getName());
//		}
//		System.out.println(subject[0].getName());
//		System.out.println(subject[1].getName());
//		System.out.println(subject[2].getName());
		
		// args 배열의 길이 확인
//		int length = args.length;
//		System.out.println("인자의 개수 : " + length);
//		
//		// args 배열의 모든 요소 출력
//		for(int i=0; i<length; i++) {
//			System.out.println("인자 #" + (i+1) + ": " + args[i]);
//		}
		
		// 실습 ===========================
		
//		int[][] score = {{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
//		
//		// 각 학생의 과목 총점, 평균
//		// 과목별 총점
//		
//		int math = 0;
//		int kor = 0;
//		int eng = 0;
//		int sum = 0;
//		double avg = 0;
//		
//		System.out.println("번호 수학 국어 영어 총점 평균");
//		System.out.println("=======================");
//		
//		for(int i=0; i<score.length; i++) {
//			sum = 0; // 반복이 시작 될 때마다 초기화
//			System.out.print(i + 1 + " ");
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//				System.out.print(score[i][j] + " ");
//			}
//			math += score[i][0]; // 각 행의 같은 열에 있는 값을 더해준다.
//			kor += score[i][1];
//			eng += score[i][2];
//			avg = (double)sum / score[i].length;
//			System.out.print(sum + " " + avg);
//			System.out.println();
//		}
//		
//		System.out.println("=======================");
//		System.out.println("총점 " + math + " " + kor + " " + eng);
		
		
		// 빙고 만들기
		
//		final int SIZE = 5;
//		int x = 0;
//		int y = 0;
//		int val = 0;
//		int cnt = 0;
//		boolean flag = false;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int[][] bingo = new int[SIZE][SIZE];
//		
//		for(int i=0; i<SIZE; i++) {
//			for(int j=0; j<SIZE; j++) {
//				bingo[i][j] = i * SIZE + j + 1;
//			}
//		}
//		
//		System.out.println("스왑 전");
//		for(int row[] : bingo) {
//			for(int num : row) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		// 배열 스왑
		
//		for(int i=0; i<SIZE; i++) {
//			for(int j=0; j<SIZE; j++) {
//				x = (int)(Math.random()*SIZE);
//				y = (int)(Math.random()*SIZE);
//			
//				int tmp;
//				tmp = bingo[i][j];
//				bingo[i][j] = bingo[x][y];
//				bingo[x][y] = tmp;
//			}
//			
//		}
//		
	
//		System.out.println("스왑 후");
//		for(int row[] : bingo) {
//			for(int num : row) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int k=0; k<SIZE; k++) {
//			System.out.println("숫자를 입력하세요");
//			val = scan.nextInt();
//			for(int i=0; i<SIZE; i++) {
//				for(int j=0; j<SIZE; j++) {
//					if(bingo[i][j] == val) {
//						bingo[i][j] = 0;
//					}
//				}
//			} 
//			for(int row[] : bingo) {
//				for(int num : row) {
//					System.out.print(num + " ");
//				}
//				System.out.println();
//			}
//			
//		}
		
		
//		do {
//			System.out.println();
//			for(int row[] : bingo) {
//				for(int num : row) {
//					System.out.print(num + " ");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("숫자를 입력하세요");
//			val = scan.nextInt();
//			
//			for(int i=0; i<SIZE; i++) {
//				cnt = 0;
//				for(int j=0; j<SIZE; j++) {
//					if(bingo[i][j] == val) {
//						bingo[i][j] = 0;
//					}
//					int tmp = 4;
//					if(bingo[i][j] == 0) {
//						cnt++;
//						if(cnt == 5) {
//							flag = true;
//							System.out.println("BINGO!");
//							break;
//						}
//					}
//					for(int j=0; j<SIZE; j++) {
//						if(bingo[j][i] == 0) {
//							cnt++;
//						}
//					}
//					
//					if(cnt == 5) {
//						flag = true;
//						System.out.println("BINGO!");
//						break;
//					}
//				}
//				
//				
//			}
//			if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0) {
//				flag = true;
//				System.out.println("BINGO!");
//			}
//			if(bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0) {
//				flag = true;
//				System.out.println("BINGO!");
//			}
//			
//			if(flag == true) {
//				break;
//			}
//			
//		}while(val != 0);
//		
//		System.out.println("GAME OVER");
		
//		do {
//			System.out.println();
//			for(int row[] : bingo) {
//				for(int num : row) {
//					System.out.print(num + " ");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("숫자를 입력하세요");
//			val = scan.nextInt();
//			
//			for(int i=0; i<SIZE; i++) {
//				cnt = 0;
//				for(int j=0; j<SIZE; j++) {
//					if(bingo[i][j] == val) {
//						bingo[i][j] = 0;
//					}
//					
//					if(bingo[i][j] == 0) {
//						cnt++;
//						System.out.println("cnt : " + cnt);
//						if (cnt == 5) {
//							flag = true;
//							System.out.println("빙고");
//							break;
//						}
//					}
//
//				}
//				if(flag == true) {
//					break;
//				}
//			}
//			if(flag == true) {
//				break;
//			}
//			
//		}while(val != 0);
//		
//		System.out.println("GAME OVER");	

		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("교환할 금액을 입력하세요");
//		
//		int[] coinUnit = {500,100,50,10};
//		
//		int money = scan.nextInt();
//
//		System.out.println("money = " + money);
//		
//		for(int i=0; i<coinUnit.length; i++) {
//			System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i] + "개");
//			money = money % coinUnit[i];
//		}
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("교환할 금액을 입력하세요");
//		
//		int money = scan.nextInt();
//		
//		int[] coinUnit = {500,100,50,10};		
//		int[] coin = {5,5,5,5};
//		
//		int A = 0;
//		
//		System.out.println("money : " + money);
//		for(int i=0; i<coinUnit.length; i++) {
//			A = money / coinUnit[i];
//			coin[i] -= A;
//			if(A >= 5) {
//				coin[i] = 0;
//				System.out.println(coinUnit[i] + "원 : " + 5 + "개");
//				money = money - 5 * coinUnit[i]; 
//			}else {
//				System.out.println(coinUnit[i] + "원 : " + A + "개");
//				money -= A * coinUnit[i]; 
//			}
//		
//		}
//		
//		if(money > 0) {
//			System.out.println("거스름 돈이 부족합니다");
//			System.out.println("잔액 : " + money);
//			System.exit(1);
//		}
//		
//		System.out.println("== 남은 동전 ==");
//		for(int i=0; i<coinUnit.length; i++) {
//			System.out.println(coinUnit[i] + "원 : " + coin[i] + "개");
//		}
					
		
//		for(int i=0; i<coinUnit.length; i++) {
//			int coinNum = 0;
//			
//			coinNum = money / coinUnit[i];
//			
//			if(coin[i] >= coinNum) {
//				coin[i] -= coinNum;
//			}else {
//				coinNum = coin[i];
//				coin[i] = 0;
//			}
//			
//			money -= coinNum * coinUnit[i];
//			
//			System.out.println(coinUnit[i] + "원 : " + coinNum + "개");
//		
//		
//		}
//		
//		if(money > 0) {
//			System.out.println("거스름 돈이 부족합니다");
//			System.out.println("잔액 : " + money);
//			System.exit(1);
//		}
//		
//		System.out.println("== 남은 동전의 갯수 ==");
//		
//		for(int i=0; i<coinUnit.length; i++) {
//			System.out.println(coinUnit[i] + "원 : " + coin[i] + "개");
//		}
		
		
	}

}





		
		