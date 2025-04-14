import java.util.Comparator;
import java.util.stream.Stream;

public class StudentStreamMain {

	public static void main(String[] args) { // 2.12

		// 직접 값을 받아서 스트립 생성
		
		Stream<Student> studentStream = Stream.of(
				new Student("hong", 2, 220)
				,new Student("park", 2, 195)
				,new Student("kim", 2, 280)
				,new Student("lee", 1, 255)
				,new Student("choi", 1, 225)
				,new Student("jang", 1, 265)
				,new Student("gang", 4, 275)
				);
		
//		System.out.println("==정렬 전==");
//		studentStream.forEach(System.out::println);
		
//		System.out.println("==기본 정렬==");
//		studentStream.sorted().forEach(System.out::println);
		// sorted()가 compareTo() 메소드를 사용하여 기본 정렬을 수행한다.
		// Compareable 인터페이스를 상속하지 않으면 기본 정렬할 수 없다.
		
		// 메소드를 변경하지 않고 정렬 기준을 바꾸는 방법
//		studentStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);
		// 내림차순
//		studentStream.sorted(Comparator.comparing(Student::getBan).reversed()).forEach(System.out::println);
		// 반 오름차순 정렬 뒤 같은 반에서 기본 정렬
		// naturalOrder = 기본 정렬
//		studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		// 반 내림차순 정렬 뒤 같은 반에서 기본 정렬
//		studentStream.sorted(Comparator.comparing(Student::getBan).reversed().thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		
		// 람다식으로 표현
//		studentStream.sorted(Comparator.comparing((Student i) -> i.getBan())).forEach(i -> System.out.println(i));
		// ? 왜 i를 Student로 캐스팅해야하죠?
//		studentStream.sorted(Comparator.comparing((Student i) -> i.getBan()).reversed()).forEach(i -> System.out.println(i));
		
		// Comparator.<Student>naturalOrder() -> 제네릭 타입을 지정
//		studentStream.sorted(Comparator.comparing((Student i) -> i.getBan()).reversed().thenComparing(Comparator.<Student>naturalOrder())).forEach(i -> System.out.println(i));
		
	}

}

//? 왜 i를 Student로 캐스팅해야하죠?
//위 코드에서 Comparator.comparing((Student i) -> i.getBan())는 람다 표현식을 통해 학생 객체의 학급(ban)을 기준으로 정렬합니다.
//
//(Student i)로 타입을 명시적으로 지정하는 이유는 타입 안정성을 보장하기 위함입니다. 즉, Stream의 요소가 Student 타입임을 컴파일러에게 확실히 알려주는 것입니다.
//
//이유
//컴파일러가 정확한 타입을 인식: 명시적으로 Student 타입을 지정함으로써, 컴파일러는 람다 표현식 내부에서 Student 클래스의 메서드를 사용할 수 있음을 확실히 인식합니다. 이는 코드의 가독성을 높이고, 타입 관련 오류를 줄여줍니다.
//
//자동 타입 추론 오류 방지: 경우에 따라, 컴파일러가 타입을 정확히 추론하지 못할 수 있습니다. 이럴 때 명시적인 타입 지정은 불필요한 타입 추론 오류를 방지하는 데 도움이 됩니다.
//
//직관적인 코드: 타입을 명확히 지정함으로써, 코드를 읽는 사람이 해당 람다 표현식이 어떤 타입의 객체를 처리하는지 바로 이해할 수 있게 합니다.
//
//이 예제에서는 i -> i.getBan()로도 충분할 수 있지만, (Student i)로 명시적으로 지정하면 위와 같은 장점이 있습니다.

//Comparator.<Student>naturalOrder() 해야하는 이유
//Comparator.naturalOrder()는 비교할 객체가 Comparable 인터페이스를 구현할 경우, 그 객체의 자연 순서를 기준으로 정렬하는 Comparator를 생성합니다. 여기서 제네릭 타입 <Student>를 명시적으로 지정하는 이유는 다음과 같습니다:
//
//타입 안정성 보장: 제네릭 타입을 명시적으로 지정하면, 컴파일러가 이 Comparator가 Student 객체와 관련된 것임을 확실히 알 수 있습니다. 이를 통해 타입 관련 오류를 방지할 수 있습니다.
//
//명확한 타입 추론: 제네릭 타입을 명시하지 않으면, 컴파일러는 이를 Comparator<Object>로 간주할 수 있습니다. 이는 Student 타입의 객체에 적용할 때 예상치 못한 오류를 초래할 수 있습니다. <Student>를 명시하면 컴파일러가 정확히 Student 타입에 대해 비교를 수행하게 됩니다.
//
//코드 가독성 향상: 제네릭 타입을 명시적으로 지정하면, 코드를 읽는 사람이 이 Comparator가 어떤 타입의 객체를 비교하는지 명확히 알 수 있습니다. 이는 코드의 가독성을 높이고 유지보수성을 향상시킵니다.