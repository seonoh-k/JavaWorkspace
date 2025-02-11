
public class Lambda2Main { // 2.11

	public static void main(String[] args) {

		// 람다식으로 작성한 독립된 객체
		MyFunction2 f1 = () -> System.out.println("f1.run()");
		
		// 인터페이스는 객체 생성 불가능
//		MyFunction2 f2 = new MyFunction2();
		
		// Myfunction2 인터페이스를 상속 받는 익명 클래스를 생성. 추상 메소드를 오버라이딩 해야한다. 클래스 타입으로 참조 변수 선언 불가능
		// 자신 타입으로 변수를 선언, 오버라이딩한 메소드를 참조.
		MyFunction2 f2 = new MyFunction2() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
			
		MyFunction2 f3 = getMyFunction();
		// f3 = System.out.println("f3.run()");
		
		f1.run();
		f2.run();
		f3.run();
		
		// 함수 내에 람다식으로 직접작성
		execute(() -> System.out.println("f4.run()"));
		
	}

	static void execute(MyFunction2 f) {
		f.run();
	}
	
	static MyFunction2 getMyFunction() {
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
}
