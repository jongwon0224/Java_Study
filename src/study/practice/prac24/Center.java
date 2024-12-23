package study.practice.prac24;

import java.util.List;

public class Center {

	List <Employee> employeeList;
	List <Room> roomList;
	
	
	// 직원 추가 메소드
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	// 룸 추가 메소드
	public void addRoom(Room room) {
		roomList.add(room);
	}
	
	public void printAllEmp() {
		for (Employee employee : employeeList) {
			System.out.println(employee.getInfo());
		}
	}
		
}