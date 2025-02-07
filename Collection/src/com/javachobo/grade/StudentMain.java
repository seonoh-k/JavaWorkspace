package com.javachobo.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			switch(displayMenu()) {
			case 1 : 
				inputRecord(); // 학생 성적 입력하기
				break;
			case 2 : 
				displayRecord(); // 학생 성적 보기
				break;
			case 3 : 
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
	}

	static int displayMenu() {
		// 메뉴 선택
		System.out.println("********************************");
		System.out.println("*  성  적  관  리  프  로  그  램  *");
		System.out.println("********************************");
		
		System.out.println("메뉴를 선택하세요");
		System.out.println();
		System.out.println("1. 학생 성적 입력하기");
		System.out.println();
		System.out.println("2. 학생 성적 보기");
		System.out.println();
		System.out.println("3. 프로그램 종료");
		
		int menu = 0;
		
		do {
			try {
				menu = s.nextInt();
				
				if(menu >= 1 && menu <= 3) {
					break;
				}else {
					throw new Exception("입력 값을 확인하세요");
				}				
			}catch(Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요");
				System.out.println("메뉴를 선택하세요");
			}
		}while(true);
		
		return menu;
	}
	
	static void inputRecord() {
		// 학생 성적 입력하기
		System.out.println("1. 학생 성적 입력하기");
		System.out.println("이름, 반, 번호, 국어 성적, 영어 성적, 수학 성적의 순서로 공백 없이 입력하세요");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인으로 돌아갑니다.");

		s.nextLine();
		while(true) {
			System.out.print(">>");
			try {
				String input = s.nextLine().trim(); // trim => 공백제거
				
				if(!input.equalsIgnoreCase("q")) {
					Scanner s2 = new Scanner(input).useDelimiter(","); // ,를 기준으로 값을 분리해서 buffer에 저장
					Student s = new Student(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());
					record.add(s);
					System.out.println("학생 정보 등록 완료");
				}else {
					return;
				}				
			}catch(Exception e) {
				System.out.println("입력 오류 DEATH");
				System.out.println("이름, 반, 번호, 국어 성적, 영어 성적, 수학 성적의 순서로 공백 없이 입력하세요");
			}
			
		}
		
	}
	
	static void displayRecord() {
		// 학생 성적 보기
		
		for(int i=0; i<record.size(); i++) {
			System.out.println(record.get(i));
		}
	}
}
