
public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person(); // ��ü�� ����
		Person p2 = new Person(); // ���ο� ��ü ����. ���������� �ٸ� �޸𸮸� ����. 
		
//		p2 = p1; // ��ü p1�� ���� ��ü p2�� ����. ���� Ÿ���� ��ü������ ����. ������ �ּҰ��� ������ �ȴ�. p2�� �ּҰ��� ������� p2�� �Ҵ�Ǿ��� �޸𸮴� GC���� �����ȴ�. �ڹٰ� ���� GC�� �ϳ� ���̶� ���� ���� ��Ʈ��ũ ���񽺿��� ���� �ʴ�.
//		
//		p1.age = 10;
//		System.out.println(p1.age);
//		System.out.println(p2.age);
		
		
//		p1.name = "ȫ�浿";
//		System.out.println(p1.name);
//		
//		System.out.println(p2.name);
		
//		System.out.println(p1); // ��ü�� �ּҰ�
//		p1.showInfo();
//		
		p1.name = "ȫ�浿";  // ��ü ������ �ʱ�ȭ
		p1.age = 18;
		p1.height = 188.7;
		
//		p1.showInfo();
		
		p1.showInfo2();
		String info = p1.showInfo2();
		System.out.println(info);
		
	}

}
