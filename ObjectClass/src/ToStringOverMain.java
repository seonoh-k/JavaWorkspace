
public class ToStringOverMain {

	public static void main(String[] args) { // 2.5

//		ToStringOver ts = new ToStringOver("hong", 20, "seoul", "kakao", 100);
		
//		System.out.println(ts.name);
//		System.out.println(ts.age);
//		System.out.println(ts.address);
//		System.out.println(ts.company);
//		System.out.println(ts.salary);
		
//		System.out.println(ts);
		
		// ���� ����
		// ������ ���� ���� �ʱ�ȭ�� �� �ִ�
		
//		ToStringOver ts2 = ToStringOver.builder()
//							.name("hong")
//							.age(20)
//							.company("kakao")
//							.build();
		
//		System.out.println(ts2);
		
		ToStringOver ts3 = new ToStringOver(100, 1);
		System.out.println(ts3);
		
	}

}
