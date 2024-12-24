package study.practice.prac24;

import java.util.ArrayList;

public class CenterMain {

	public static void main(String[] args) {
		
		Center center = new Center();
		
				
//		Employee e1 = new Employee("justine", "강사", 1, 35, 10, 5000);
		Employee e2 = new Employee("helena", "조교", 2, 28, 5, 3000);
		
		// 리스트에 추가
		center.employeeList.add(new Employee("justine", "강사", 1, 35, 10, 5000));
		center.addEmployee(new Employee("justine", "강사", 1, 35, 10, 5000));
		// 리스트에 추가
		center.employeeList.add(e2);
		center.addEmployee(e2);
		// 리스트에 정보 출력
		center.printAllEmp();
		

		WaitingRoom r1 = new WaitingRoom(1,1);
		// 룸 이름 지정
		r1.setName("대기실 1");
		// 문 열렸나 확인
		r1.doorOpen();
		// 룸리스트에 추가
		center.addRoom(r1);
		
		// 정수기 여부 확인
		System.out.println(r1.getWaterPurifier());
		
	}
		
}