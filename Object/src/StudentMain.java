
public class StudentMain {

	public static void main(String[] args) {

		Student st = new Student();
		
		st.name = "�ȼ���";
		st.grade = 3;
		st.classNum = 2;
		st.number = 24;
		st.kor = 90;
		st.math = 80;
		st.eng = 67;
		
		st.introduce();
		System.out.println("===============");
		
		Student st1 = new Student("ȫ�浿", 1, 3, 28, 80, 90, 70);
		Student st2 = new Student("�����ż�", 2, 5, 14, 77, 65, 95);
		
		st1.introduce();
		
		System.out.println("===============");
		
		st2.introduce();
		
		
	}

}
