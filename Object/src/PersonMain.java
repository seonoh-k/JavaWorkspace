
public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person(); // 객체의 생성
		Person p2 = new Person(); // 새로운 객체 생성. 물리적으로 다른 메모리를 가짐. 
		
//		p2 = p1; // 객체 p1의 값을 객체 p2에 대입. 같은 타입의 객체끼리만 가능. 동일한 주소값을 가지게 된다. p2의 주소값이 사라지고 p2에 할당되었던 메모리는 GC으로 삭제된다. 자바가 가진 GC는 하나 뿐이라 게임 같은 네트워크 서비스에는 맞지 않다.
//		
//		p1.age = 10;
//		System.out.println(p1.age);
//		System.out.println(p2.age);
		
		
//		p1.name = "홍길동";
//		System.out.println(p1.name);
//		
//		System.out.println(p2.name);
		
//		System.out.println(p1); // 객체의 주소값
//		p1.showInfo();
//		
		p1.name = "홍길동";  // 객체 변수의 초기화
		p1.age = 18;
		p1.height = 188.7;
		
//		p1.showInfo();
		
		p1.showInfo2();
		String info = p1.showInfo2();
		System.out.println(info);
		
	}

}
