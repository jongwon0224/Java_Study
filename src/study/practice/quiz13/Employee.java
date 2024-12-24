package study.practice.quiz13;

public class Employee {


	String name, dept, position; // 이름, 부서명, 직급
	int age, birth; // 나이, 생일
	
	Status stats; //status객체
	Register regi; //register객체
	
	
	public Employee (String name, String dept, String position, int age, int birth, Status stats, Register regi) {
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.age = age;
		this.birth = birth;
		this.stats = stats;
		this.regi = regi;
	}
	

	public String getInfo() {
		return String.format("이름:%s, 부서:%s, 직급:%s, 나이:%d",name, dept, position, age);
	}
	
	
	
	

	

}

