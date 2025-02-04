
public class Tank extends Unit { // 2.4

	@Override
	void move(int x, int y) {
		if(x>=50 && x<=60) {
			stop();
			System.out.println("이동 불가");
		}
	}
	
	
	void changeMode() {}
}
