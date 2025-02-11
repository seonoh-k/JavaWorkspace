import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamClass { // 2.11

	// Stream
	// 컬렉션, 배열 
	// 데이터 소스가 무엇이던 간에 같은 방식으로 다룰 수 있게 해서 재사용성을 높인것
	// 데이터 소스로부터 읽기만 할 뿐 변경하지는 않는다.
	// 일회용
	
	String[] strArr = {"aaa", "bbb", "ccc"};
	
//	Arrays.sort(strArr);
//	for(String s : strArr) {
//		System.out.println(s);
//	}
	
	// 일반적인 리스트 생성
	// ArrayList<String> list = new ArrayList<>();
	
	// 배열을 리스트로 변환
	// 크기 변경이 불가능함
	List<String> strList = Arrays.asList(strArr);
//	Collections.sort(strList);
//	for(String s : strList) {
//		System.out.println(s);
//	}
	
	// List를 Stream으로 변환
	Stream<String> strStream1 = strList.stream();
	
	// 배열을 Stream으로 변환
	Stream<String> strStream2 = Arrays.stream(strArr);
	
	// void forEach(Consumer<? super T> action);
	// T를 상속 받은 ?까지만 제네릭 타입으로 허용. 하한 제한
//	strStream1.sorted().forEach(i -> System.out.println(i));
//	strStream1.sorted().forEach(System.out::println);
	
	// Stream의 연산
	// 중간 연산 : 연산이 데이터에 영향을 주지 않는다
		// distinct() : 중복 제거
		// filter() : 조건에 안맞는 요소를 제외
		// sort() : 정렬
		// map() : 반복하면서 요소를 원하는 형태로 변환
		// mapToInt() : int형으로 변환 
	// 최종 연산 : 연산이 데이터를 변화 시킨다
		// forEach() : 요소를 반복하면서 처리
		// count() : 요소의 개수 반환
		// toArray() : 스트링의 요소를 배열로 반환
	
	
}
