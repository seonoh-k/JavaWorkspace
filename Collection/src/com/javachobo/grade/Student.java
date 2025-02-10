package com.javachobo.grade;

public class Student {

	String studentNo;
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	
	
	
	public Student(String studentNo, String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}


	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)(getTotal()/3f);
	}


	@Override
	public String toString() {
		return "Student [studentNo = " + studentNo + ", name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", total=" + total;
	}
	
	
	
}
