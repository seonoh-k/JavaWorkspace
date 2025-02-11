import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@NoArgsConstructor  // 기본생성자 import 단축키 = ctrl + shift + o
@AllArgsConstructor // 모든 멤버변수를 포함하는 생성자
@RequiredArgsConstructor // 상수값(final)을 가지는 멤버 변수를 대상으로하는 생성자
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
