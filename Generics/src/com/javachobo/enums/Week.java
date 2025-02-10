package com.javachobo.enums;

public enum Week { // 2.10


	// 값을 대문자로 사용한다.
	// 값에 고유번호가 주어진다. 0 ~ N
	// static 개념. enum이름을 타입으로 사용
	
//	MONDAY,
//	TUESDAY,
//	WEDNESDAY,
//	THURSDAY,
//	FRIDAY,
//	SATURDAY,
//	SUNDAY
	
	
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"),
	THURSDAY("목요일"),
	FRIDAY("금요일"),
	SATURDAY("토요일"),
	SUNDAY("일요일");
	
	private String korean;
	
	Week(String korean) {
		this.korean = korean;
	}
	
	public String getKorean() {
		return korean;
	}
	
	
	
}
