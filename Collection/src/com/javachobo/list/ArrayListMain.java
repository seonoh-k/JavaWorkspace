package com.javachobo.list;
import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayListMain {

	public static void main(String[] args) { // 2.6
		// Collection - List - ArrayLinst
		
		// �迭 ����
		// ������ �����͸� ������ ��� ����
		// ���� ���� Ÿ���� Object
		// Ÿ���� üũ�ؾ� �Ѵ�.(ĳ����) 
		// �߰����� ���� ó���ϴ� �ð��� �����ɸ���.
		
//		int i = 10;
//		Integer it;
//		it = i; // new Integer(i); Autoboxing
		
//		Object obj = i; // new Object(i); Autoboxing
		
//		ArrayList list = new ArrayList(); // ũ��� �⺻ 10������ �Է��� ���� �þ��
//		list.add(new Integer(5));
//		list.add(new Integer(1));
//		list.add(new Integer(3));
//		list.add(new Integer(2));
//		list.add(new Integer(4));
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(3));
//		System.out.println(list.get(2));
//		System.out.println(list.get(4));
		
//		list.add(5); // Autoboxing
//		list.add(1); // Autoboxing
//		list.add(3); // Autoboxing
//		list.add(2); // Autoboxing
//		list.add(4); // Autoboxing
		
//		for(int i=0; i<list.size(); i++) { // size() => �����Ͱ� ����ִ� ũ��
//			System.out.println(list.get(i));
//		}
		
//		list.remove(0); // index(0)�� ���� ����. ���������� index ��ȣ�� �մ������. list�� ũ�Ⱑ �پ������ �ʴ´�.
		
//		System.out.println("== ���� �� ==");
//		for(int i=0; i<list.size(); i++) { // list�� �迭 ������ ���ϱ� ������ �ݺ��� ���
//			System.out.println(list.get(i));
//		}
		
//		list.remove(1); // index(1) ���� �� index(3)�� null���� �ȴ�.
//		list.remove(3); // remove()�� �ڿ������� �����ϴ°� ����.
		
//		System.out.println("== ���� ���� �� ==");
//		for(int i=list.size()-1; i>=0; i--) { // list�� �ڿ������� ����. 
//			if(list.contains(5)) { // list�� 5��� ���� �ִٸ�
//				list.remove(i);				
//			}
//			list.remove(i);
//		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		ArrayList list = new ArrayList();
//		
//		list.add(new String("1"));
//		list.add("2"); // ���ڿ��� �� ��ü�� ��ü
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		list.add("6");
//		list.add("7");
//		list.add("8");
//		list.add("9");
//		list.add("10");
//		
//		for(Object o : list) { // list�� Object ������ �޾Ƶ���
//			System.out.println((String)o); // Object�� String���� ĳ����
//		}
//		
//		int sum = 0;
//		
//		for(Object o : list) {
//			String s = (String)o; // Object�� String���� ĳ����
//			int num = Integer.parseInt(s); // ���ڿ��� ���ڷ� ��ȯ 
//			sum += num;
//		}
//		
//		System.out.println(sum);
		
		
//		Stack st = new Stack(); // LIFO(Last In, First Out) ���Լ���. 
//		
//		st.push(0); // ���ÿ� �����͸� �߰�
//		st.push(1);
//		st.push(2);
		
//		st.pop(); // ������ ���� ���� �ִ� �����͸� ������ ����
//		st.peek(); // ������ ���� ���� �ִ� �����͸� ��ȯ, ���� X �����Ͱ� ���������� ó���� ��ٷο����Ƿ� �� �Ⱦ�
//		try {
//			System.out.println(st.pop());
//			System.out.println(st.pop());
//			System.out.println(st.pop());
//			System.out.println(st.pop()); // => EmptyStackException : ������ �������			
//		}catch(EmptyStackException e) {
//			System.out.println("Stack�� ������ϴ�");
//		}
		
		// st.isEmpty() ������ ����ִ��� Ȯ��. ����ִٸ� True
//		while(!st.isEmpty()) { // ������ ����ִٸ� �ݺ� ����
//			try {
//				System.out.println(st.pop());
//			}catch(EmptyStackException e) {
//				System.out.println("Stack�� ������ϴ�");
//			}
//		}
		
		// ���������� ������ �����ΰ���, �ڷΰ���� ���ÿ� url �ּҸ� �߰��ϴ� ��. �湮 ������ ����Ѵ�.
		
//		goUrl("����Ʈ");
//		goUrl("���̹�");
//		goUrl("īī��");
//		goUrl("����");
//		
//		printStatus();
//		
//		goBack();
//		goBack();
//		goBack();
//		
//		System.out.println("�ڷΰ��� ����");
//		printStatus();
//		
//		goForward();
//		goForward();
//		
//		System.out.println("�����ΰ��� ����");
//		printStatus();
//		
//		goUrl("�ν�Ÿ�׷�");
//		System.out.println("���ο� URL");
//		printStatus();
		
		// 2.7
		// �ݺ��� ���� (Iterator) => �������̽�
		// ���� �о���� ����
		// boolean hasNext() : �������� �������� Ȯ��, next() : ���� �о�´�, remove() : ����. �� �Ⱦ���
		
//		ArrayList list = new ArrayList();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		
//		Iterator it = list.iterator(); // �÷����� ���ͷ�����ȭ �Ѵ�.
//		
//		while(it.hasNext()) {
//			int num = (Integer)it.next();
//			System.out.println(num);
//		}
		
		
	}
	
	// 2.6 stack
//	public static Stack back = new Stack();
//	public static Stack forward = new Stack();
//
//	public static void goBack() {
//		if(!back.empty()) {
//			forward.push(back.pop()); // back ������ ���� ���� �ִ� �����͸� forward ���ÿ� ����
//		}
//	}
//	
//	public static void goForward() {
//		if(!forward.empty()) {
//			back.push(forward.pop());
//		}
//	}
//	
//	public static void goUrl(String url) {
//		back.push(url);
//		if(!forward.empty()) {
//			forward.clear(); // ���ÿ� ����� �����͸� ���� ����
//		}
//	}
//	
//	public static void printStatus() {
//		System.out.println("back stack : " + back); // back => toString���� �������̵� �Ǿ�����
//		System.out.println("forward stack : " + forward); 
//	}
}
