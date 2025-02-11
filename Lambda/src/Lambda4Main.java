import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda4Main {

	public static void main(String[] args) { // 2.11
		
		// java.util.function 패키지에 포함된 함수형 인터페이스
		
		// Runnalbe          -> void run()             : 매개변수 x 반환값 x 
		// Supplier<T>       -> T get()                : 매개변수 x 반환값 o
		// Consumer<T>       -> void accept(T t)       : 매개변수 o 반환값 x
		// Function<T,R>     -> R apply(T t)           : 매개변수 o 반환값 o
		// Predicate<T>      -> boolean test(T t)      : 매개변수 o 반환값 boolean

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
		// 3 Function<T, T>의 기능을 수행하고 새로운 리스트에 대입
		List<T> newList = new ArrayList<>(list.size()); // 기본크기 10. 크기 지정 가능
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		// 2 ArrayList 출력
		
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
	
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		// 1 ArrayList에 값 초기화
		for(int i=0; i<10; i++) {
			list.add(s.get());
			// 인터페이스 Supplier<T>의 메소드 T get()
		}
	}
	
	
}
