import java.io.File;
import java.util.stream.Stream;

public class StreamMap { // 2.12

	public static void main(String[] args) {

		// Map()
		// 스트림의 요소에 저장된 값 중에서 원하는 값을 받아내서 특정 형태로 변환하는 역할
		// 중간 연산자
		// 반복해서 값을 읽어온다
		// 연산 결과를 String으로 반환한다
		// Stream<File> -> Stream<String> 제네릭 타입을 File에서 String으로 변환하는데 Map을 사용
		
		File[] fileArr = {
				new File("Ex1.java")
				, new File("Ex1.bak")
				, new File("Ex2.java")
				, new File("Ex1")
				, new File("Ex1.txt")
				, new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName); 
		// 람다식
//		Stream<String> filenameStream = fileStream.map((File i) -> i.getName()); 
		
		filenameStream.forEach(System.out::println);
		System.out.println("====");
		
		// 최종 연산 이후에 다시 사용할 경우 새롭게 스트림 생성.
		fileStream = Stream.of(fileArr); 
		
		// 확장자가 없는 파일 처리(조건에 안맞는 요소 제외)
		// .indextOf() = 인덱스에 존재하지 않는 경우 -1을 반환
//		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1)).forEach(System.out::println); 
		// .toUpperCase() = 요소를 대문자로 변환
//		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1).map(s -> s.toUpperCase()).forEach(System.out::println); 
		// distinct() = 중복 요소 제거
		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1).map(s -> s.toUpperCase()).distinct().forEach(System.out::println); 
		
	}

}
