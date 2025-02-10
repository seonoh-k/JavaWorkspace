package com.javachobo.enums;

public enum DevType { // 2.10

	MOBILE("모바일"), WEB("웹"), SERVER("서버");
	
	private String department;
	
	DevType(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
}
