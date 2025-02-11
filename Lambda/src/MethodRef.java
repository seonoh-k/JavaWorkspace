import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRef { // 2.11

	public static void main(String[] args) {

		// method reference. �޼ҵ� ���� ��� : ���ٽ��� �ϳ��� �޼ҵ常 ȣ���ϴ� ��� �����ϰ� ���� ���
		
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);

		Function<String, Integer> f2 = Integer::parseInt; // �޼ҵ� ���� ���
		
		BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
		
		BiFunction<String, String, Boolean> f4 = String::equals; // Class :: Method

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		// ��ǥ������ ��� �Լ��� ���� ���
		// ���ٽ�
//      list.forEach(i -> System.out.println(i));
        
        // �޼ҵ� ����
        list.forEach(System.out::println);

        
	}

}
