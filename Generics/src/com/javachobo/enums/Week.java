package com.javachobo.enums;

public enum Week { // 2.10


	// ���� �빮�ڷ� ����Ѵ�.
	// ���� ������ȣ�� �־�����. 0 ~ N
	// static ����. enum�̸��� Ÿ������ ���
	
//	MONDAY,
//	TUESDAY,
//	WEDNESDAY,
//	THURSDAY,
//	FRIDAY,
//	SATURDAY,
//	SUNDAY
	
	
	MONDAY("������"),
	TUESDAY("ȭ����"),
	WEDNESDAY("������"),
	THURSDAY("�����"),
	FRIDAY("�ݿ���"),
	SATURDAY("�����"),
	SUNDAY("�Ͽ���");
	
	private String korean;
	
	Week(String korean) {
		this.korean = korean;
	}
	
	public String getKorean() {
		return korean;
	}
	
	
	
}
