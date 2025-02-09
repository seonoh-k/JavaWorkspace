
public class Student {

	// 속성 : 이름, 학년, 반, 번호, 국어성적, 수학성적, 영어성적
	// 기능 : 자기소개
	
	String name;
	int grade;
	int classNum;
	int number;
	int kor;
	int math;
	int eng;
	
	
	void introduce() {
		System.out.println("이름 : " + this.getName());
		System.out.println("학년 : " + this.getGrade());
		System.out.println("반 : " + this.getClassnumber());
		System.out.println("번호 : " + this.getNumber());
		System.out.println("국어 : " + this.getKor());
		System.out.println("수학 : " + this.getMath());
		System.out.println("영어 : " + this.getEng());
		System.out.println("총점 : " + this.sum());
		System.out.println("평균 : " + this.avg());
	}
	
	int sum() {
		return kor + math + eng; 
	}
	
	double avg() {
		return sum() / 3;
	}
	
	Student() {
		
	}
	
	Student(String name, int grade, int classNum, int number, int kor, int math, int eng) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
	String getName() {
		return this.name;
	}
	
	int getGrade() {
		return this.grade;
	}
	
	int getClassnumber() {
		return this.classNum;
	}
	
	int getNumber() {
		return this.number;
	}
	
	int getKor() {
		return this.kor;
	}
	
	int getMath() {
		return this.math;
	}
	
	int getEng() {
		return this.eng;
	}
	
}
