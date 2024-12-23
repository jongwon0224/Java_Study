package study.practice.prac24;

public class Employee {
	// 필드
	String name, position;
	int gender, age, career, salary;
	// 생성자
	public Employee () {
		
	}
	
	public Employee (String name, String position, int gender, int age, int career, int salary) {
		this.name = name;
		this.position = position;
		this.gender = gender;
		this.age = age;
		this.career = career;
		this.salary = salary;
	}
	
	public String getInfo() {
		String genderStr = (gender == 1) ? "남성" : "여성";
		return String.format("이름:%s, 직책: %s, 성별: %s, 나이: %d, 경력: %d년, 연봉: %d만원", name, position, genderStr, age, career, salary);
	}
}
