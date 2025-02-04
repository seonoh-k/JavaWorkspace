
public class DataMain3 {

	public static void main(String[] args) {

		Data d3 = new Data();
		d3.x = 10;
		
		System.out.println("d3.x = " + d3.x);
		
		Data d4 = change(d3); // tmp의 주소값을 받는 새로운 객체 생성
		
		System.out.println("d4.x = " + d4.x); // tmp.x == d4.x
		
	}
	
	static Data change(Data d) {
		Data tmp = new Data(); // 지역변수로 새로운 객체 tmp를 생성
		tmp.x = d.x; // d.x를 tmp.x에 대입, 값의 복사
		
		return tmp; // tmp의 주소값을 반환
		
	}

}
