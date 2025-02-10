package com.javachobo.enums;

public class EnumMain { // 2.10

	public static void main(String[] args) {

		Week today = Week.MONDAY;
		
		System.out.println(today); // MONDAY
		
		System.out.println(today.name()); // MONDAY
		
		System.out.println(Week.MONDAY.ordinal()); // 0
		System.out.println(Week.SUNDAY.ordinal()); // 6
		
		Week[] days = Week.values(); // 배열 형태로 생성
		
		for(Week day : days) {
			System.out.println(day); // 순차 출력
		}
		
		System.out.println(Week.SATURDAY.getKorean());
		
		for(Week day : days) {
			System.out.println(day.getKorean());
		}
		
	}

}
