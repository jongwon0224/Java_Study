package study.inherit.inherit01;

public class Child extends Parent {

	int grade;
	String schoolName;

	public Child(int grade, String schoolName, int money) {
		super(money);
		this.grade = grade;
		this.schoolName = schoolName;
	}
	
	public Child() {
		super(0); // 부모클래스 생성자 호출 (상속)
		System.out.println("자식클래스 생성");
	}
	
	public void setGrade (int grade) {
		this.grade = grade;
	}
	
	public void setSchoolName (String schoolName) {
		this.schoolName = schoolName;
	}
	
	public int GetGrade () {
		System.out.println(grade);
		return grade;
	}
	
	public String GetSchoolName () {
		System.out.println(schoolName);
		return schoolName;
	}
	
	public void play() {
		System.out.println("뛰어놀기");
	}
	
	public void printInfo() {
		System.out.println(grade + " " + schoolName + " " + money);
	}
	
}
