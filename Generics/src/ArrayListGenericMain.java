import java.util.ArrayList;

public class ArrayListGenericMain {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		// <> 타입을 제한. 입력하지 않으면 오브젝트 타입.
		
//		list.add(new Integer(1));
//		list.add(new String("a")); // 타입 제한
//		// 타입을 제한하게 되면 입력하는 값이 통일 되기 때문에 일일이 캐스팅해서 사용할 필요가 없어진다.
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
