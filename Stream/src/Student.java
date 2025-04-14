import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student> { // 2.11

	String name;
	private	int ban;
	private int totalScore;
	
	@Override
	public int compareTo(Student o) {
		// totalScore를 기준으로 내림차순 정렬 
		return o.totalScore - this.totalScore;
		// 오름차순
//		return this.totalScore - o.totalScore;
		
//		return o.ban - this.ban;
//		return this.ban - o.ban;
		
	}
	// sorted()가 compareTo() 메소드를 사용하여 기본 정렬을 수행한다.
	// Compareable 인터페이스를 상속하지 않으면 기본 정렬할 수 없다.
	
	
}
