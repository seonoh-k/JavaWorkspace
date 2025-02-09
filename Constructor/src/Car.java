
public class Car {

	// 속성(변수)
	String color;
	String gearType;
	int door;
	
	// 생성자 : 
	// 1. 인스턴스 변수의 값을 초기화 하는 역할을 한다.
	// 2. 클래스의 이름과 동일하게 작성한다.
	// 3. 리턴값은 없다.
	// 4. 기본생성자, 매개변수를 가지는 생성자(명시적 생성자)
	// 5. 생성자는 오버로딩이 가능하다.
	// 6. 생성자는 객체 생성 시에만 호출 가능하다.
	// 7. 생성자간 호출이 가능하다. this(매개변수)
	
//	Car() {
//		기본 생성자. 생략 가능
//		단, 오버로딩 시에는 작성해야 한다.
//	}  
	
	Car() {
		this.color = "red";
		this.gearType = "Auto";
		this.door = 5;
	}
	
	Car(String color) {
		this.color = color;
	}
	
	Car(String color, String gearType) {
		//this.color = color;
		//this.gearType = gearType;
		
		this(color, gearType, 5);
		// 매개변수의 타입과 개수에 맞는 생성자를 호출
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
//		this.멤버변수의 이름 = 매개변수의 이름
	}
	
	// 기능
	
	String getColor() {
		return this.color;
	}
	
	String getGeartype() {
		return this.gearType;
	}
	
	int getDoor() {
		return this.door;
	}
	
}
