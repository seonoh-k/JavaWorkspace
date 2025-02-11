package com.javachobo.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain { // 2.7

	public static void main(String[] args) {

		// Collection - Set
		// List와 거의 같다. get메소드가 없음.
		
//		HashSet set = new HashSet();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(1);   // 중복 불가능
//		set.add("1"); // 데이터 입력 순서 상관 없음
		//[1, 1, 2, 3, 4] // 중복된 데이터가 있다면 데이터 타입이 다른 것.
		
//		System.out.println(set);
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			int num = (Integer)it.next();
//			System.out.println(num);
//		}
		
		// Set 컬렉션을 사용한 로또 번호 만들기
		
//		HashSet lotto = new HashSet();
//		
//		for(int i=0; lotto.size()<6; i++) { // HashSet lotto의 사이즈가 6보다 작으면 반복. 중복값을 허용하지 않기 때문
//			
//			int num = (int)(Math.random()*45) + 1;
//			lotto.add(num);
//			
//		}
//		System.out.println(lotto);	
		
		Set set = new HashSet(); // 다형성을 활용한 방식
		
		int[][] board = new int[5][5];
		
		// 1~50 사이의 25개 숫자를 입력
		
		for(int i=0; set.size()<25; i++) { // set의 사이즈가 25가 될 때까지 반복.
			
			int num = (int)(Math.random()*50)+1;
			set.add(num);
			
		}
		
		
//		Iterator it = set.iterator(); // 이터레이터를 통해 값을 읽어온다.
//		
//		
//		for(int i=0; i<board.length; i++) {
//			for(int j=0; j<board.length; j++) {
//				board[i][j] = (int)it.next();
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		} // 1~50사이의 25개 숫자를 이차원 배열에 중복 없이 입력하는 것은 가능하지만 Set의 특성상 데이터가 정렬되어 있어 배열 순서를 건드릴 수는 없다.
		
		ArrayList list = new ArrayList(set); // list에 있는 shuffle 기능을 사용하기 위해 캐스팅
		
		Collections.shuffle(list);
		
		Iterator it = list.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = (int)it.next();
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
