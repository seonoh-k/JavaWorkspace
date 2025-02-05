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

// 1. Student Ŭ���� �ۼ�
//
// 2. ��� ����
// 	private �̸�, ����, �г�, ��, ��ȣ
//
// 3. ��������� �ʱ�ȭ�� �� �ִ� ������ lombok
//
// 4. ��������� ���� getter/setter lombok
//
// 5. �л��� ������ ����ϴ� �޼ҵ� lombok
//
// 6. ���� Ŭ���� �ۼ�
//
// 7. ���� �������� ��ü ����
