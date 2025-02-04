
public class DataMain {

	public static void main(String[] args) {
		
		DataMain da = new DataMain(); 
		// 인스턴스 메소드를 사용하기 위해 자신 클래스를 메인 함수 내에 객체로 생성
		
		Data d1 = new Data();
		d1.x = 10;
		System.out.println("변경전 x = " + d1.x);
		
		change(d1.x);
		System.out.println("변경후 x = " + d1.x);
		
		da.change1(d1.x);
	}

	static void change(int x) { // 값의 복사
		x = 1000; // 메소드 안에서만 실행, 지역변수를 사용하므로 d1.x의 값은 훼손되지 않는다.
		System.out.println("change x = " + x );
	} // 메소드 실행 후 지역변수 x는 사라진다.
	
	void change1(int x) { // 인스턴스 메소드
		x = 2000;
		System.out.println("change x = " + x);
	}
}
