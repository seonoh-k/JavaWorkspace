import java.util.ArrayList;

public class ArrayListGenericMain {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		// <> Ÿ���� ����. �Է����� ������ ������Ʈ Ÿ��.
		
//		list.add(new Integer(1));
//		list.add(new String("a")); // Ÿ�� ����
//		// Ÿ���� �����ϰ� �Ǹ� �Է��ϴ� ���� ���� �Ǳ� ������ ������ ĳ�����ؼ� ����� �ʿ䰡 ��������.
//		
//		System.out.println(list.get(0));
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum = 0;
		for(int i : list) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
