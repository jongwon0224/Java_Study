package study.practice.quiz13;

import java.util.ArrayList;


public class CompanyMain {

	public static void main(String[] args) {
		
		
		MonthlyData data = new MonthlyData();
		
		Status s1 = new Status(1,12,24);
		Register r1 = new Register(s1);
		
		Employee e1 = new Employee("황종원", "영업", "사원", 26, 980224, s1, r1);
		e1.stats.setOffice(2);
		
		data.employeeList = new ArrayList <>();
		data.addEmployee(e1);
		data.printInfo();
		
		

	}

}
