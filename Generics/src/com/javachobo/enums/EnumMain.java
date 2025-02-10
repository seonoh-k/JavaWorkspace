package com.javachobo.enums;

public class EnumMain { // 2.10

	public static void main(String[] args) {

		Week today = Week.MONDAY;
		
		System.out.println(today); // MONDAY
		
		System.out.println(today.name()); // MONDAY
		
		System.out.println(Week.MONDAY.ordinal()); // 0
		System.out.println(Week.SUNDAY.ordinal()); // 6
		
		Week[] days = Week.values(); // �迭 ���·� ����
		
		for(Week day : days) {
			System.out.println(day); // ���� ���
		}
		
		System.out.println(Week.SATURDAY.getKorean());
		
		for(Week day : days) {
			System.out.println(day.getKorean());
		}
		
	}

}
