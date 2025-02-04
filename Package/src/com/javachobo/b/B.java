package com.javachobo.b;
import com.javachobo.a.A;

public class B extends A {

	int z;
	
	void test() {
//		A a = new A();
//		a.x = 10; // 다른 패키지이기 때문에 사용 불가
		x = 10;   // 상속 구조로 바꾸면 사용 가능
	}
	
	
}
