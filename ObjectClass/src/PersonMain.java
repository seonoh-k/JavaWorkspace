
public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person(123456, "hong");
		Person p2 = new Person(123456, "hong");
				
		if(p1 == p2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(p1.equals(p2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		// hashCode() = unique. �ý��ۿ��� ��ü�� �����ϴ� �ڵ�.
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
