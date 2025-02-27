
public class CarMain {

	public static void main(String[] args) {

//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
		
//		fe.water();
//		car = fe; // Up캐스팅
//		// car.water(); 
//		fe2 = (FireEngine)car; // Down캐스팅
//		fe2.water();
		
		Car car = new FireEngine(); // 2.4
		// 다형성을 활용하여 코드 작성을 최소화할 수 있다.
		if(car instanceof FireEngine) { // car의 타입 체크.
			System.out.println("FireEngine Yes");
			FireEngine fe = (FireEngine)car; // FireEngine의 멤버를 사용하기 위해 Casting
			fe.water();
		}else {
			System.out.println("Ambulance Yes");
			Ambulance am = (Ambulance)car; // Ambulance의 멤버를 사용하기 위해 Casting
			am.siren();
		}
		
	}

}
