import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFinalMain {

	public static void main(String[] args) { // 2.12
		
		// 최종 연산자
		// forEach()    		   : 반복 출력
		// reduce(BinaryOperator<Integer> accumulator)  : 요소를 소모
		// count()          	   : 요소의 개수를 반환
		// max(), min()     	   : 최대값, 최소값
		// sum(), average() 	   : 합계, 평균
		
		// Optional
		// 반환 타입이 Optional
		// reduce()
		// max(), min()
		// average()
		// getAsInt(), getAsDouble() 각 타입으로 변환해서 반환
		
		
//		Stream<Integer> number = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
//		number.forEach(System.out::println);
		
		// 출력 이후 실행 시 number가 가리키는 위치는 마지막 데이터 이므로 다음 위치부터 null값이 된다. IllegalStateException
		// reduce() = return 타입이 Optional 데이터를 소모하면서 처리
		// 스트림의 요소를 반복적으로 처리. 시작시 x = 0, y = index(0). x += x + y 이후 index(0) 데이터를 삭제한다.
		// Optional - 동작 수행 결과 값이 null인지 체크.
//		Optional<Integer> sum = number.reduce((x, y) -> x + y); 
		
		// Integer의 기능을 활용하는 방식
//		Optional<Integer> sum = number.reduce(Integer::sum);
		
//		number.forEach(System.out::println); // IllegalStateException

//		sum.ifPresent(s -> System.out.println("sum : " + s)); // sum : 55
		// sum.ifPresent() : sum의 데이터가 null인지 아닌지 확인. null이라면 동작하지 않음. 예외 처리 불필요
		
		// x의 초기값을 10으로 정의
//		Integer sum = number.reduce(10, (x, y) -> x + y);
//		System.out.println(sum); // 65
		
		// 기본형 타입을 사용한 스트림 생성
		IntStream stream1 = IntStream.of(30, 70, 90, 10);
		IntStream stream2 = IntStream.of(30, 70, 90, 10);
		
		System.out.println(stream1.sum());                   // 200
		System.out.println(stream2.average().getAsDouble()); // 50.0 반환타입을 double 타입으로 변환
		
//		Stream<String> stream3 = Stream.of("3000", "700", "90", "10");

//		System.out.println(stream1.count()); // 4
//		System.out.println(stream1.max()); // OptionalInt[90]
//		System.out.println(stream1.min()); // OptionalInt[10]
		
		// 정수형 Optional
//		OptionalInt min = stream2.min();
//		min.ifPresent(m -> System.out.println("min : "+ m)); // min : 10
		// Optional에서 정수형으로 변환해서 출력
//		System.out.println(min.getAsInt());
		
		
		
	}

}
