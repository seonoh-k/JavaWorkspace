package com.javachobo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {

//		HashMap map = new HashMap();
//		
//		// put(key, value), get(key) => value, remove(key)
		// key, value는 기본적으로 Object 타입으로 반환
//		// keySet(), entrySet(), values()
//		map.put("myId", "1234");
//		map.put("asdf", "1234");
//		map.put("asdf", "1234");
//	
//		System.out.println(map);
//		
//		System.out.println(map.get("myId"));
//		System.out.println(map.get("asdf"));
//		
//		map.remove("myId");
//		System.out.println(map);
//		
//		System.out.println(map.containsKey("asdf"));
		
//		Map map = new HashMap();
//		
//		map.put("myId", "1234");
//		map.put("asdf", "1234");
//		map.put("asdf", "4567");
//		
//		// 반복자 패턴
//		Iterator itKey = map.keySet().iterator();
//		
//		while(itKey.hasNext()) {
//			String key = (String)itKey.next();
//			System.out.println(key);
//		} // key값만 읽어온다
//		
//		Iterator itEntry = map.entrySet().iterator();
//		
//		// Map.Entry => Map 컬렉션의 key, value로 구성된 데이터를 저장하는데 사용. 중첩 인터페이스
//		// key 값이 중복인 경우 value 값이 덮어씌워진다.
//		while(itEntry.hasNext()) {
//			Map.Entry entry = (Map.Entry)itEntry.next();
//			String key = (String)entry.getKey(); // 키 값
//			String value = (String)entry.getValue(); // 밸류 값
//			System.out.printf("key : %s, value : %s\n", key, value);
//		}
		
		Map map = new HashMap();
		
		map.put("김자바", 90);
		map.put("이자바", 70);
		map.put("박자바", 60);
		map.put("최자바", 50);
		map.put("강자바", 80);
		
//		Iterator it = map.entrySet().iterator(); // 값을 가져올 it의 위치를 초기화
//		
//		int sum = 0;
//		double avg = 0;
//		
//		while(it.hasNext()) { // 값을 확인한 위치값이 시작점으로 돌아오지 않는다. it를 다시 사용하려면 초기화 작업이 필요하다
//			Map.Entry entry = (Map.Entry)it.next();
//			String key = (String)entry.getKey();
//			int value = (int)entry.getValue();
//			sum += value;
//			avg = (double)sum / map.size();
//			System.out.printf("이름 : %s, 점수 : %d\n", key, value);
//		}
//		System.out.printf("총점 : %d, 평균 : %f", sum, avg);
//		
//		Collection values = map.values(); // value 값만 가져온다
//		Iterator itValues = values.iterator();
//		
//		while(itValues.hasNext()) {
//			int num = (Integer)itValues.next();
//			sum += num;
//		}
//		avg = (double)sum / map.size();
//		System.out.printf("총점 : %d, 평균 : %f", sum, avg);

		// Iterator 생략하기
		for(Object key : map.keySet()) { // key 값 가져오기
			String name = (String)key;
			System.out.println(name);
		}
		
		for(Object obj : map.entrySet()) { // key, value 값 가져오기
			Map.Entry entry = (Map.Entry)obj;
			String key = (String)entry.getKey();
			int value = (int)entry.getValue();
			System.out.printf("이름 : %s, 점수 : %d\n", key, value);
		}
		
		
		
	}

}
