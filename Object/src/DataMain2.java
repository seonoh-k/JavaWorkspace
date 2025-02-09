
public class DataMain2 {

	public static void main(String[] args) {

		Data d2 = new Data();
		d2.x = 10;
		
		System.out.println("변경전 x = " + d2.x);
		
		change(d2);
		
		System.out.println("변경후 x = " + d2.x);
	}

	static void change(Data d) { // 참조방식 reference. 주소값을 가져온다.
		d.x = 1000; // 주소값의 x값을 변경하므로 d2.x가 변경된다.
		System.out.println("change x = " + d.x);
	}
	
}
