
public class BoxMain {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		// ��ü ������ Ÿ���� ����
		
		box.name = "Kong";
		box.setName("Hong");
		String name = box.getName(); // ��ȯŸ���� String
		System.out.println(name);
		
	}

}
