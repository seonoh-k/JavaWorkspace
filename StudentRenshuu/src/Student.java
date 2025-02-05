import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {

	private String name;
	private int age;
	private int grade;
	private int cNum;
	private int stNum;
	
}

// 1. Student 클래스 작성
//
// 2. 멤버 변수
// 	private 이름, 나이, 학년, 반, 번호
//
// 3. 멤버변수를 초기화할 수 있는 생성자 lombok
//
// 4. 멤버변수에 대한 getter/setter lombok
//
// 5. 학생의 정보를 출력하는 메소드 lombok
//
// 6. 메인 클래스 작성
//
// 7. 빌더 패턴으로 객체 생성
