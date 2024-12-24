package study.practice.quiz13;

import java.util.ArrayList;
import java.util.List;

public class MonthlyData {

	List <Employee> employeeList;
	
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void printInfo () {
		for(Employee employee : employeeList) {
			System.out.println(employee.getInfo());
			employee.regi.regi_check();
		}
	}
}
