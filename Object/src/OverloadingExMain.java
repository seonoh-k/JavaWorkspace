
public class OverloadingExMain {

	public static void main(String[] args) {

		OverloadingEx ov = new OverloadingEx();
		
		ov.add();
		
		ov.add(10);
		
		ov.add(10.5);
		
		ov.add(10, 20);
		
		ov.add(10, 20L);
		
		ov.add(10L, 20);
		
		System.out.println(); // 오버로딩을 사용하고 있는 함수
	}

}
