
public class Tv {

	// 속성 : 색상, 전원버튼, 채널
	// 기능 : 전원 온오프, 채널 증가 감소
	
	
	String color;
	boolean power;
	int channel;
	
	void powerBtn() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
