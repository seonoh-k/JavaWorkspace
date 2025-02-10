package com.javachobo.enums;

public enum DevType { // 2.10

	MOBILE("�����"), WEB("��"), SERVER("����");
	
	private String department;
	
	DevType(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
}
