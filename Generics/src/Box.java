
public class Box<T> { // 2.10

	T name;
	// T == 데이터타입
	// 타입을 미리 정의하지 않고 필요할 때 정의할 수 있다.
	
	T getName() {
		return this.name;
	}
	
	void setName(T name) {
		this.name = name;
	}
}
