import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student> { // 2.11

	String name;
	int ban;
	int totalScore;
	
	@Override
	public int compareTo(Student o) {
		
		return o.totalScore - this.totalScore;
	}

	
	
}
