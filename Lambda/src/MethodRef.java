import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRef { // 2.11

	public static void main(String[] args) {

		// method reference. 메소드 참조 방식 : 람다식이 하나의 메소드만 호출하는 경우 간략하게 적는 방식
		
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);

		Function<String, Integer> f2 = Integer::parseInt; // 메소드 참조 방식
		
		BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
		
		BiFunction<String, String, Boolean> f4 = String::equals; // Class :: Method

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		// 대표적으로 출력 함수에 많이 사용
		// 람다식
//      list.forEach(i -> System.out.println(i));
        
        // 메소드 참조
        list.forEach(System.out::println);

        
	}

}
