package com.javachobo.list;
import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayListMain {

	public static void main(String[] args) { // 2.6
		// Collection - List - ArrayLinst
		
		// 배열 형식
		// 참조형 데이터만 값으로 사용 가능
		// 값의 저장 타입은 Object
		// 타입을 체크해야 한다.(캐스팅) 
		// 중간에서 값을 처리하는 시간이 오래걸린다.
		
//		int i = 10;
//		Integer it;
//		it = i; // new Integer(i); Autoboxing
		
//		Object obj = i; // new Object(i); Autoboxing
		
//		ArrayList list = new ArrayList(); // 크기는 기본 10이지만 입력할 수록 늘어난다
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
		
//		for(int i=0; i<list.size(); i++) { // size() => 데이터가 들어있는 크기
//			System.out.println(list.get(i));
//		}
		
//		list.remove(0); // index(0)의 값을 삭제. 순차적으로 index 번호가 앞당겨진다. list의 크기가 줄어들지는 않는다.
		
//		System.out.println("== 삭제 후 ==");
//		for(int i=0; i<list.size(); i++) { // list가 배열 형식을 취하기 때문에 반복문 사용
//			System.out.println(list.get(i));
//		}
		
//		list.remove(1); // index(1) 삭제 후 index(3)은 null값이 된다.
//		list.remove(3); // remove()는 뒤에서부터 실행하는게 좋다.
		
//		System.out.println("== 순차 삭제 후 ==");
//		for(int i=list.size()-1; i>=0; i--) { // list의 뒤에서부터 삭제. 
//			if(list.contains(5)) { // list에 5라는 값이 있다면
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
//		list.add("2"); // 문자열은 그 자체로 객체
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		list.add("6");
//		list.add("7");
//		list.add("8");
//		list.add("9");
//		list.add("10");
//		
//		for(Object o : list) { // list는 Object 값으로 받아들임
//			System.out.println((String)o); // Object를 String으로 캐스팅
//		}
//		
//		int sum = 0;
//		
//		for(Object o : list) {
//			String s = (String)o; // Object를 String으로 캐스팅
//			int num = Integer.parseInt(s); // 문자열을 숫자로 변환 
//			sum += num;
//		}
//		
//		System.out.println(sum);
		
		
//		Stack st = new Stack(); // LIFO(Last In, First Out) 후입선출. 
//		
//		st.push(0); // 스택에 데이터를 추가
//		st.push(1);
//		st.push(2);
		
//		st.pop(); // 스택의 가장 위에 있는 데이터를 꺼내고 제거
//		st.peek(); // 스택의 가장 위에 있는 데이터를 반환, 제거 X 데이터가 남아있으면 처리가 까다로워지므로 잘 안씀
//		try {
//			System.out.println(st.pop());
//			System.out.println(st.pop());
//			System.out.println(st.pop());
//			System.out.println(st.pop()); // => EmptyStackException : 스택이 비어있음			
//		}catch(EmptyStackException e) {
//			System.out.println("Stack이 비었습니다");
//		}
		
		// st.isEmpty() 스택이 비어있는지 확인. 비어있다면 True
//		while(!st.isEmpty()) { // 스택이 비어있다면 반복 종료
//			try {
//				System.out.println(st.pop());
//			}catch(EmptyStackException e) {
//				System.out.println("Stack이 비었습니다");
//			}
//		}
		
		// 웹브라우저의 페이지 앞으로가기, 뒤로가기는 스택에 url 주소를 추가하는 것. 방문 순서도 기록한다.
		
//		goUrl("네이트");
//		goUrl("네이버");
//		goUrl("카카오");
//		goUrl("구글");
//		
//		printStatus();
//		
//		goBack();
//		goBack();
//		goBack();
//		
//		System.out.println("뒤로가기 실행");
//		printStatus();
//		
//		goForward();
//		goForward();
//		
//		System.out.println("앞으로가기 실행");
//		printStatus();
//		
//		goUrl("인스타그램");
//		System.out.println("새로운 URL");
//		printStatus();
		
		// 2.7
		// 반복자 패턴 (Iterator) => 인터페이스
		// 값을 읽어오는 형태
		// boolean hasNext() : 데이터의 존재유무 확인, next() : 값을 읽어온다, remove() : 삭제. 잘 안쓴다
		
//		ArrayList list = new ArrayList();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		
//		Iterator it = list.iterator(); // 컬렉션을 이터레이터화 한다.
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
//			forward.push(back.pop()); // back 스택의 가장 위에 있는 데이터를 forward 스택에 저장
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
//			forward.clear(); // 스택에 저장된 데이터를 전부 제거
//		}
//	}
//	
//	public static void printStatus() {
//		System.out.println("back stack : " + back); // back => toString으로 오버라이딩 되어있음
//		System.out.println("forward stack : " + forward); 
//	}
}
