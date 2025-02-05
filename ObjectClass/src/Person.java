import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;

@AllArgsConstructor
//@EqualsAndHashCode // equals와 hashCode의 오버라이딩
@Data // @Getter @Setter @ToString @EqualsAndHashCode @RequiredArgsConstructor 전부 포함
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
//		return this.id == other.id && this.name.equals(other.name); // 두가지 변수를 동시에 체크. 
//	}
//	// equals 메소드를 오버라이딩하여 두 멤버 변수를 비교할 수 있다.
//	// 컬렉션에서 중복 판단이 가능
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name); // 두가지 변수를 동시에 체크
//	}
	
	
	
}
