import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Time {	
	
	private int Hour;
	private int Minute;
	private float Seconds;
	
	// private�� �ܺ� Ŭ�������� ���� �Ұ�.
	// getter ��ü���� ���� �о�� / setter �о�� ���� ������ ����  // �޼ҵ带 ���� ���������� ������ ���
	// getter/setter �޼ҵ�� public �ؾ� �Ѵ�.
	
	
	
	// getter / setter �ڵ� ���� ��� ���
	
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
//			System.out.println("�߸��� �ð�����");
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
//			System.out.println("�߸��� �� ����");
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
//			System.out.println("�߸��� �� ����");
//			return;
//		}
//		
//		this.Seconds = Seconds;
//	}
	
//	public void pirintTime(Time t[]) {
//		System.out.println(t[].getHour() + ":" + t[].getMinute() + ":" + t[].getSeconds());
//	}
}


