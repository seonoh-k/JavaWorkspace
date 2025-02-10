
public class BoxMain {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		// 객체 생성시 타입을 지정
		
		box.name = "Kong";
		box.setName("Hong");
		String name = box.getName(); // 반환타입은 String
		System.out.println(name);
		
	}

}
