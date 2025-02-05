
public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person(123456, "hong");
		Person p2 = new Person(123456, "hong");
				
		if(p1 == p2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// hashCode() = unique. 시스템에서 객체를 관리하는 코드.
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
