
public class StudentMain {

	public static void main(String[] args) {
		
		Student st = Student.builder()
						.name("¾öº¹µ¿")
						.age(25)
						.grade(3)
						.cNum(4)
						.stNum(45)
						.build();
		
		Student st2 = Student.builder()
						.name("Edie")
						.age(37)
						.grade(3)
						.cNum(2)
						.stNum(23)
						.build();
		
		st.toString();
		System.out.println(st);
		
		st2.toString();
		System.out.println(st2);
		
		
	}
}
