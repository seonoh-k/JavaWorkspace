import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lambda3Main { // 2.11

	public static void main(String[] args) {

		// java.util.function 패키지에 포함된 함수형 인터페이스
		
		// Runnalbe          -> void run()             : 매개변수 x 반환값 x 
		// Supplier<T>       -> T get()                : 매개변수 x 반환값 o
		// Consumer<T>       -> void accept(T t)       : 매개변수 o 반환값 x
		// Function<T,R>     -> R apply(T t)           : 매개변수 o 반환값 o
		// Predicate<T>      -> boolean test(T t)      : 매개변수 o 반환값 boolean
		
		// BiConsumer<T,U>   -> void accept(T t,U u)   : 매개변수 2 반환값 x
		// BiPredicate<T,U>  -> boolean test(T t,U, u) : 매개변수 2 반환값 boolean
		// BiFunction<T,U,R> -> R apply(T t,U u)       : 매개변수 2 반환값 x
		
		// UnaryOperator<T>  -> R apply(T t)           : 매개변수 타입과 결과의 타입이 같다.
		// BinaryOperator<T> -> R apply(T t,T t)       : 매개변수 타입과 결과의 타입이 같다.
		
		// 컬렉션과 관련된 함수형 인터페이스
		// Collection -> boolean removeIf(Predicate<E> filter)      : 조건에 맞는 요소 삭제.
		// List       -> void replaceAll(UnaryOperator<T> operator) : 모든 요소를 변환하여 대체한다. 
		// Iterable   -> void forEach(Consumer<T> action)           : 모든 요소에 작업 action을 적용한다.
		// Map        -> void forEach(BiConsumer<T,U> action)       : 모든 요소에 작업 action을 적용한다.
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		list.forEach((i) -> System.out.println(i));
		// list의 인덱스에 순차적으로 System.out.println(i)를 적용한다. 0부터 순차 출력
		
		System.out.println("====");
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("====");
		// 매개변수가 하나인 경우 괄호 생략 가능
		list.removeIf(i -> i % 2 == 0 || i % 3 == 0);
		// i가 2의 배수 또는 3의 배수이면 삭제. 
		list.forEach(i -> System.out.println(i));
		
		System.out.println("====");
		list.replaceAll(i -> i * 10);
		list.forEach(i -> System.out.println(i));
		
		System.out.println("====");
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		map.forEach((k, v) -> System.out.printf("key : %s, value : %s\n", k, v));
		
		System.out.println("====");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.printf("key : %s, value : %s\n", entry.getKey(), entry.getValue());
		}
		
		
		
	}

}
