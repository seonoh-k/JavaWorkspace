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
				inputRecord(); // �л� ���� �Է��ϱ�
				break;
			case 2 : 
				displayRecord(); // �л� ���� ����
				break;
			case 3 : 
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
		
	}

	static int displayMenu() {
		// �޴� ����
		System.out.println("********************************");
		System.out.println("*  ��  ��  ��  ��  ��  ��  ��  ��  *");
		System.out.println("********************************");
		
		System.out.println("�޴��� �����ϼ���");
		System.out.println();
		System.out.println("1. �л� ���� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л� ���� ����");
		System.out.println();
		System.out.println("3. ���α׷� ����");
		
		int menu = 0;
		
		do {
			try {
				menu = s.nextInt();
				
				if(menu >= 1 && menu <= 3) {
					break;
				}else {
					throw new Exception("�Է� ���� Ȯ���ϼ���");
				}				
			}catch(Exception e) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				System.out.println("�޴��� �����ϼ���");
			}
		}while(true);
		
		return menu;
	}
	
	static void inputRecord() {
		// �л� ���� �Է��ϱ�
		System.out.println("1. �л� ���� �Է��ϱ�");
		System.out.println("�̸�, ��, ��ȣ, ���� ����, ���� ����, ���� ������ ������ ���� ���� �Է��ϼ���");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. �������� ���ư��ϴ�.");

		s.nextLine();
		while(true) {
			System.out.print(">>");
			try {
				String input = s.nextLine().trim(); // trim => ��������
				
				if(!input.equalsIgnoreCase("q")) {
					Scanner s2 = new Scanner(input).useDelimiter(","); // ,�� �������� ���� �и��ؼ� buffer�� ����
					Student s = new Student(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());
					record.add(s);
					System.out.println("�л� ���� ��� �Ϸ�");
				}else {
					return;
				}				
			}catch(Exception e) {
				System.out.println("�Է� ���� DEATH");
				System.out.println("�̸�, ��, ��ȣ, ���� ����, ���� ����, ���� ������ ������ ���� ���� �Է��ϼ���");
			}
			
		}
		
	}
	
	static void displayRecord() {
		// �л� ���� ����
		
		for(int i=0; i<record.size(); i++) {
			System.out.println(record.get(i));
		}
	}
}
