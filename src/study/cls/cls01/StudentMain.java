package study.cls.cls01;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[] arr = new int[3];
		
		Student stu1 = null;
		stu1 = new Student();
		stu1.name = "황종원";
		stu1.grade = 5;
		
		Student stu2 = new Student();
		stu2.name = "백종원";
		stu2.grade = 3;
		
		System.out.println(stu1.name +"은 " + stu1.grade +"학년 입니다.");
		System.out.println(stu2.name + "은 " + stu2.grade +"학년 입니다.");
	}

}
