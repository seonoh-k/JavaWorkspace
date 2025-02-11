import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda4Main {

	public static void main(String[] args) { // 2.11
		
		// java.util.function ��Ű���� ���Ե� �Լ��� �������̽�
		
		// Runnalbe          -> void run()             : �Ű����� x ��ȯ�� x 
		// Supplier<T>       -> T get()                : �Ű����� x ��ȯ�� o
		// Consumer<T>       -> void accept(T t)       : �Ű����� o ��ȯ�� x
		// Function<T,R>     -> R apply(T t)           : �Ű����� o ��ȯ�� o
		// Predicate<T>      -> boolean test(T t)      : �Ű����� o ��ȯ�� boolean

		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
		
		Consumer<Integer> c = i -> System.out.print(i + " ");
		
		Predicate<Integer> p = i -> i % 2 == 0;
		
		Function<Integer, Integer> f = i -> i / 10 * 10;
		
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(p, c, list);
		System.out.println();
		
		System.out.println(doSomthing(f, list));
		
		List<Integer> newList = doSomthing(f, list);
		System.out.println(newList);
	}
	
	static <T> List<T> doSomthing(Function<T, T> f, List<T> list) {
		// 3 Function<T, T>�� ����� �����ϰ� ���ο� ����Ʈ�� ����
		List<T> newList = new ArrayList<>(list.size()); // �⺻ũ�� 10. ũ�� ���� ����
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		// 2 ArrayList ���
		
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
	
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		// 1 ArrayList�� �� �ʱ�ȭ
		for(int i=0; i<10; i++) {
			list.add(s.get());
			// �������̽� Supplier<T>�� �޼ҵ� T get()
		}
	}
	
	
}
