
public class Tv {

	// �Ӽ� : ����, ������ư, ä��
	// ��� : ���� �¿���, ä�� ���� ����
	
	
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
