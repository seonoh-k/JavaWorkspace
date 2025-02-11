import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lambda3Main { // 2.11

	public static void main(String[] args) {

		// java.util.function ��Ű���� ���Ե� �Լ��� �������̽�
		
		// Runnalbe          -> void run()             : �Ű����� x ��ȯ�� x 
		// Supplier<T>       -> T get()                : �Ű����� x ��ȯ�� o
		// Consumer<T>       -> void accept(T t)       : �Ű����� o ��ȯ�� x
		// Function<T,R>     -> R apply(T t)           : �Ű����� o ��ȯ�� o
		// Predicate<T>      -> boolean test(T t)      : �Ű����� o ��ȯ�� boolean
		
		// BiConsumer<T,U>   -> void accept(T t,U u)   : �Ű����� 2 ��ȯ�� x
		// BiPredicate<T,U>  -> boolean test(T t,U, u) : �Ű����� 2 ��ȯ�� boolean
		// BiFunction<T,U,R> -> R apply(T t,U u)       : �Ű����� 2 ��ȯ�� x
		
		// UnaryOperator<T>  -> R apply(T t)           : �Ű����� Ÿ�԰� ����� Ÿ���� ����.
		// BinaryOperator<T> -> R apply(T t,T t)       : �Ű����� Ÿ�԰� ����� Ÿ���� ����.
		
		// �÷��ǰ� ���õ� �Լ��� �������̽�
		// Collection -> boolean removeIf(Predicate<E> filter)      : ���ǿ� �´� ��� ����.
		// List       -> void replaceAll(UnaryOperator<T> operator) : ��� ��Ҹ� ��ȯ�Ͽ� ��ü�Ѵ�. 
		// Iterable   -> void forEach(Consumer<T> action)           : ��� ��ҿ� �۾� action�� �����Ѵ�.
		// Map        -> void forEach(BiConsumer<T,U> action)       : ��� ��ҿ� �۾� action�� �����Ѵ�.
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		list.forEach((i) -> System.out.println(i));
		// list�� �ε����� ���������� System.out.println(i)�� �����Ѵ�. 0���� ���� ���
		
		System.out.println("====");
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("====");
		// �Ű������� �ϳ��� ��� ��ȣ ���� ����
		list.removeIf(i -> i % 2 == 0 || i % 3 == 0);
		// i�� 2�� ��� �Ǵ� 3�� ����̸� ����. 
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
