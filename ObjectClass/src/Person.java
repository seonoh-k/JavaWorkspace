import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;

@AllArgsConstructor
//@EqualsAndHashCode // equals�� hashCode�� �������̵�
@Data // @Getter @Setter @ToString @EqualsAndHashCode @RequiredArgsConstructor ���� ����
public class Person { // 2.5
	
	long id;
	String name;
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Person other = null;
//		
//		if(obj instanceof Person) {
//			other = (Person)obj;
//		}
//		
//		return this.id == other.id && this.name.equals(other.name); // �ΰ��� ������ ���ÿ� üũ. 
//	}
//	// equals �޼ҵ带 �������̵��Ͽ� �� ��� ������ ���� �� �ִ�.
//	// �÷��ǿ��� �ߺ� �Ǵ��� ����
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name); // �ΰ��� ������ ���ÿ� üũ
//	}
	
	
	
}
