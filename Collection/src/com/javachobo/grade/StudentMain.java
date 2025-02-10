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
				deleteRecord(); // �л� ���� ����
				break;
			case 4 : 
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
		System.out.println("3. �л� ���� ����");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		
		int menu = 0;
		
		do {
			try {
				menu = s.nextInt();
				
				if(menu >= 1 && menu <= 4) {
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
					Student s = new Student(s2.next(), s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());
					record.add(s);
					System.out.println("�л� ���� ��� �Ϸ�");
					s2.close();
				}else {
					return;
				}				
			}catch(Exception e) {
				System.out.println("�Է� ���� DEATH");
				System.out.println("�й�, �̸�, ��, ��ȣ, ���� ����, ���� ����, ���� ������ ������ ���� ���� �Է��ϼ���");
			}
			
		}
		
	}
	
	static void displayRecord() {
		// �л� ���� ����
		
		double avg;
		
		int length = record.size();
		
		if(length > 0) {
			for(int i=0; i<length; i++) {
				Student student = (Student)record.get(i);
				avg = student.total / 3;
				System.out.println(student + ", avg = " + avg + "]");
			}
		}else {
			System.out.println("********************************");
			System.out.println("*      �л�  �����Ͱ�  �����ϴ�     *");
			System.out.println("********************************");
		}
		
//		for(int i=0; i<record.size(); i++) {
//			System.out.println(record.get(i));
//		}
	}
	
	static void deleteRecord() { // 2.10
		// �л� ���� ���� 
		System.out.println("�л� ���� �����ϱ�");
		System.out.println("������ �й��� �Է��ϼ���");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. �������� ���ư��ϴ�");
		
		while(true) {
			boolean flag = false;
			System.out.println(">>>");
			try {
				Scanner s2 = new Scanner(System.in);
				String sno = s2.nextLine().trim();
				
				if(!sno.equalsIgnoreCase("q")) {
					
					for(Object obj : record) {
						Student s = (Student)obj;
						if(s.studentNo.equals(sno)) {
							record.remove(obj);
							flag = true;
							break;
						}
					}
					
					if(flag == true) {
						System.out.println("�л� ������ �����Ǿ����ϴ�");
					}else {
						System.out.println("�л� ������ ã�� �� �����ϴ�");
					}
					System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���");
				}else {
					return;
				}
			}catch(Exception e) {
				System.out.println("�Է� �����Դϴ�");
			}
			
		}
		
	}
}
