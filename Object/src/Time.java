import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Time {	
	
	private int Hour;
	private int Minute;
	private float Seconds;
	
	// private는 외부 클래스에서 접근 불가.
	// getter 객체에서 값을 읽어옴 / setter 읽어온 값을 변수에 대입  // 메소드를 통해 간접적으로 변수를 사용
	// getter/setter 메소드는 public 해야 한다.
	
	
	
	// getter / setter 자동 생성 기능 사용
	
//	public int getHour() {
//		return Hour;
//	}
//	public void setHour(int hour) {
//		Hour = hour;
//	}
//	public int getMinute() {
//		return Minute;
//	}
//	public void setMinute(int minute) {
//		Minute = minute;
//	}
//	public float getSeconds() {
//		return Seconds;
//	}
//	public void setSeconds(float seconds) {
//		Seconds = seconds;
//	}
	
		
//	public int getHour() {
//		return Hour;
//	}
//	
//	public void setHour(int Hour) {
//		if(!(Hour >= 0 && Hour <= 23)) {
//			System.out.println("잘못된 시간정보");
//			return;
//		}
//			
//		this.Hour = Hour;				
//	}
//	
//	public int getMinute() {
//		return Minute;
//	}
//	
//	public void setMinute(int Minute) {
//		if(!(Minute >= 0 && Minute <= 59)) {
//			System.out.println("잘못된 분 정보");
//			return;
//		}
//		
//		this.Minute = Minute;
//	}
//	
//	public float getSeconds() {
//		return Seconds;
//	}
//	
//	public void setSeconds(float Seconds) {
//		if(!(Seconds >=0 && Seconds < 60)) {
//			System.out.println("잘못된 초 정보");
//			return;
//		}
//		
//		this.Seconds = Seconds;
//	}
	
//	public void pirintTime(Time t[]) {
//		System.out.println(t[].getHour() + ":" + t[].getMinute() + ":" + t[].getSeconds());
//	}
}


