package study.practice.prac19;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		/*
		s1.dept = "English";
		s1.deptNo = 20163939;
		
		System.out.println(s1.dept);
		System.out.println(s1.deptNo);
		*/
		
		s1.setDept("English");
		System.out.println(s1.getDept());
		
		s1.setDeptNo(20163939);
		System.out.println(s1.getDeptNo());
	}

}
