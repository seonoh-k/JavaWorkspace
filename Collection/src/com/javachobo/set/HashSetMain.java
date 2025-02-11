package com.javachobo.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain { // 2.7

	public static void main(String[] args) {

		// Collection - Set
		// List�� ���� ����. get�޼ҵ尡 ����.
		
//		HashSet set = new HashSet();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(1);   // �ߺ� �Ұ���
//		set.add("1"); // ������ �Է� ���� ��� ����
		//[1, 1, 2, 3, 4] // �ߺ��� �����Ͱ� �ִٸ� ������ Ÿ���� �ٸ� ��.
		
//		System.out.println(set);
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			int num = (Integer)it.next();
//			System.out.println(num);
//		}
		
		// Set �÷����� ����� �ζ� ��ȣ �����
		
//		HashSet lotto = new HashSet();
//		
//		for(int i=0; lotto.size()<6; i++) { // HashSet lotto�� ����� 6���� ������ �ݺ�. �ߺ����� ������� �ʱ� ����
//			
//			int num = (int)(Math.random()*45) + 1;
//			lotto.add(num);
//			
//		}
//		System.out.println(lotto);	
		
		Set set = new HashSet(); // �������� Ȱ���� ���
		
		int[][] board = new int[5][5];
		
		// 1~50 ������ 25�� ���ڸ� �Է�
		
		for(int i=0; set.size()<25; i++) { // set�� ����� 25�� �� ������ �ݺ�.
			
			int num = (int)(Math.random()*50)+1;
			set.add(num);
			
		}
		
		
//		Iterator it = set.iterator(); // ���ͷ����͸� ���� ���� �о�´�.
//		
//		
//		for(int i=0; i<board.length; i++) {
//			for(int j=0; j<board.length; j++) {
//				board[i][j] = (int)it.next();
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		} // 1~50������ 25�� ���ڸ� ������ �迭�� �ߺ� ���� �Է��ϴ� ���� ���������� Set�� Ư���� �����Ͱ� ���ĵǾ� �־� �迭 ������ �ǵ帱 ���� ����.
		
		ArrayList list = new ArrayList(set); // list�� �ִ� shuffle ����� ����ϱ� ���� ĳ����
		
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
