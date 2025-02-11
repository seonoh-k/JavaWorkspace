import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@NoArgsConstructor  // �⺻������ import ����Ű = ctrl + shift + o
@AllArgsConstructor // ��� ��������� �����ϴ� ������
@RequiredArgsConstructor // �����(final)�� ������ ��� ������ ��������ϴ� ������
@ToString             // toString Override
@Builder			  
public class ToStringOver { // 2.5
	
	String name;
	int age;
	String address;
	String company;
	int salary;
	
	final int MAX;
	final int MIN;
	
//	@Override
//	public String toString() {
//		return "ToStringOver [name=" + name + ", age=" + age + ", address=" + address + ", company=" + company
//				+ ", salary=" + salary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}
		
	
}
