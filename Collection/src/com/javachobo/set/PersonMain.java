package com.javachobo.set;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		Person p1 = new Person("hong", 10);
		Person p2 = new Person("hong", 10);
		Person p3 = new Person("kong", 22);
		
		set.add(p1); // p1, p2�� �ּҰ��� �ٸ��� ������ �ߺ��� �ƴϴ�
		set.add(p2);
		set.add(p3);

		System.out.println(set);
		
	}

}
