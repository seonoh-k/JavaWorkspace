
public class Tank extends Unit { // 2.4

	@Override
	void move(int x, int y) {
		if(x>=50 && x<=60) {
			stop();
			System.out.println("�̵� �Ұ�");
		}
	}
	
	
	void changeMode() {}
}
