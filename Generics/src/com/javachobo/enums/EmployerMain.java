package com.javachobo.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployerMain { // 2.10

	public static void main(String[] args) {

		List<Employer> empList = new ArrayList<>();
		Employer emp = new Employer();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = s.nextLine();
		System.out.println("경력 : ");
		String career = s.nextLine();
		System.out.println("직무파트 (0-MOBILE, 1-WEB, 2-SERVER) : ");
		int type = s.nextInt();
		
		emp.setName(name);
		emp.setCareer(career);
		
		if(type == 0) {
			emp.setType(DevType.MOBILE);
		}else if(type == 1) {
			emp.setType(DevType.WEB);
		}else if(type == 2){
			emp.setType(DevType.SERVER);
		}
		
		System.out.printf("이름 : %s\n경력 : %s\n직무파트 : %s(%s)\n", emp.getName(), emp.getCareer(), emp.getType(), emp.getType().getDepartment());
		
	}

}
