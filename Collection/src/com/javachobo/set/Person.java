package com.javachobo.set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode // lombok ������̼� ���
public class Person { // 2.7
	
	String name;
	int age;
	
	// ������ ���� ������ ��� �ؽ��ڵ带 ���� �ּҰ����� ����
	// å ����
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
	
	// ���� ����
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
