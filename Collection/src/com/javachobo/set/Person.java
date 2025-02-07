package com.javachobo.set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode // lombok 어노테이션 사용
public class Person { // 2.7
	
	String name;
	int age;
	
	// 변수의 값이 동일한 경우 해시코드를 같은 주소값으로 변경
	// 책 예시
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Person) {
//			Person person = (Person)obj;
//			return person.name.equals(name) && (person.age == age);
//		}else {
//			return false;
//		}
//	}
//	
//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	}
	
	// 수업 예시
//	@Override
//	public boolean equals(Object obj) {
//		Person other = null;
//		
//		if(obj instanceof Person) {
//			other = (Person)obj;
//		}
//		
//		return this.age == other.age && this.name.equals(other.name);
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, age);
//	}

}
