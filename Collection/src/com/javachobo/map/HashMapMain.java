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
		// key, value�� �⺻������ Object Ÿ������ ��ȯ
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
//		// �ݺ��� ����
//		Iterator itKey = map.keySet().iterator();
//		
//		while(itKey.hasNext()) {
//			String key = (String)itKey.next();
//			System.out.println(key);
//		} // key���� �о�´�
//		
//		Iterator itEntry = map.entrySet().iterator();
//		
//		// Map.Entry => Map �÷����� key, value�� ������ �����͸� �����ϴµ� ���. ��ø �������̽�
//		// key ���� �ߺ��� ��� value ���� ���������.
//		while(itEntry.hasNext()) {
//			Map.Entry entry = (Map.Entry)itEntry.next();
//			String key = (String)entry.getKey(); // Ű ��
//			String value = (String)entry.getValue(); // ��� ��
//			System.out.printf("key : %s, value : %s\n", key, value);
//		}
		
		Map map = new HashMap();
		
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 70);
		map.put("���ڹ�", 60);
		map.put("���ڹ�", 50);
		map.put("���ڹ�", 80);
		
//		Iterator it = map.entrySet().iterator(); // ���� ������ it�� ��ġ�� �ʱ�ȭ
//		
//		int sum = 0;
//		double avg = 0;
//		
//		while(it.hasNext()) { // ���� Ȯ���� ��ġ���� ���������� ���ƿ��� �ʴ´�. it�� �ٽ� ����Ϸ��� �ʱ�ȭ �۾��� �ʿ��ϴ�
//			Map.Entry entry = (Map.Entry)it.next();
//			String key = (String)entry.getKey();
//			int value = (int)entry.getValue();
//			sum += value;
//			avg = (double)sum / map.size();
//			System.out.printf("�̸� : %s, ���� : %d\n", key, value);
//		}
//		System.out.printf("���� : %d, ��� : %f", sum, avg);
//		
//		Collection values = map.values(); // value ���� �����´�
//		Iterator itValues = values.iterator();
//		
//		while(itValues.hasNext()) {
//			int num = (Integer)itValues.next();
//			sum += num;
//		}
//		avg = (double)sum / map.size();
//		System.out.printf("���� : %d, ��� : %f", sum, avg);

		// Iterator �����ϱ�
		for(Object key : map.keySet()) { // key �� ��������
			String name = (String)key;
			System.out.println(name);
		}
		
		for(Object obj : map.entrySet()) { // key, value �� ��������
			Map.Entry entry = (Map.Entry)obj;
			String key = (String)entry.getKey();
			int value = (int)entry.getValue();
			System.out.printf("�̸� : %s, ���� : %d\n", key, value);
		}
		
		
		
	}

}
