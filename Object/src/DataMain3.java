
public class DataMain3 {

	public static void main(String[] args) {

		Data d3 = new Data();
		d3.x = 10;
		
		System.out.println("d3.x = " + d3.x);
		
		Data d4 = change(d3); // tmp�� �ּҰ��� �޴� ���ο� ��ü ����
		
		System.out.println("d4.x = " + d4.x); // tmp.x == d4.x
		
	}
	
	static Data change(Data d) {
		Data tmp = new Data(); // ���������� ���ο� ��ü tmp�� ����
		tmp.x = d.x; // d.x�� tmp.x�� ����, ���� ����
		
		return tmp; // tmp�� �ּҰ��� ��ȯ
		
	}

}
