package study.db.sample.quiz05;

import java.util.List;

public class StudentExplorer {

	public static void main(String[] args) {
		
		StudentDAO s1 = new StudentDAO();
		//전체 불러오기
//		List<StudentDTO>list = s1.findStudent();
		
		// 인자값 맞게 조회하기
		List<StudentDTO>list = s1.findStudentbyGrade(4);
		
		if(list != null && list.size() > 0) {
			for(StudentDTO s : list) {
				System.out.println(s.toString());
			}
		}

	}

}
