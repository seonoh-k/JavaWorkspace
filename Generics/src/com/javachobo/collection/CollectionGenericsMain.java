package com.javachobo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionGenericsMain { // 2.10

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		// ArrayList�� �������̽� List�� ����ϹǷ� �θ� Ÿ���� List�� ��ü ������ ���� 
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("grape");
		fruits.add("peach");
		fruits.add("lemon");

		for(String item : fruits) {
			System.out.println("Fruits : " + item);
		}
		
		Map<String, String> cities = new HashMap<>();
		
		cities.put("tokyo", "japan");
		cities.put("seoul", "korea");
		cities.put("osaka", "japan");
		cities.put("busan", "korea");
		
		for(String key : cities.keySet()) {
			System.out.println("Cities : " + key + ", " + cities.get(key));
		}
		
		for(Map.Entry<String, String> entry : cities.entrySet()) {
			System.out.println("Cities : " + entry.getKey() + ", " + entry.getValue());
		}
		
		
	}

}
