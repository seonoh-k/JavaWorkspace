
public class Point { // extends Object�� ���� ���ִ�. ��� ���� ���� Ŭ������ Object�� ��� �޴´�. ��� Ŭ������ Object�� ��� ����
	
	int x = 100;
	int y = 200;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x = " + x + ", y = " + y; 
	}
}
