@FunctionalInterface
public interface MyFunction { // 2.10

	public abstract int max(int x, int y);
	// 람다식 함수를 추상 메소드를 통해 연결
	// 함수형 인터페이스는 오버라이딩 하지 않는다.
	// 람다식 함수가 함수형 인터페이스의 구현부가 된다.
	// 반드시 추상 메소드 하나만 정의해야 한다.
	// 인터페이스 작성 시 어노테이션 @FunctionalInterface을 작성하면 함수형 인터페이스로 작성해야만 한다
}
