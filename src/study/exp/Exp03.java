package study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {
		Sample s = new Sample();
		
		// 예외처리 방법1
		try {
			s.addItem1("하나");			
		} catch (Exception e) {
			System.out.println("메인에서 하나 예외처리");
		}
		
		// 예외처리 방법2
		s.addItem2("둘");
		
//		s.addItem1("1"); 1번으로 예외처리
//		s.addItem2("2"); 2번으로 예외처리
		
		// 예외처리 방법3
		try {
			s.addItem3("3");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메인에서 addItem3 호출 후 예외처리");
		}
		
		// 예외처리 방법4
		try {
			s.addItem4("4");			
		} catch (NullPointerException e) {
			
		}
		
		// 예외처리 방법5 -> 메인클래스에서 throws Exception을 하면 되지만 안하는게 좋음
		// 예외 떠넘기기
//		s.addItem3("5");
		
		
		// 예외처리 방법6 -> 메소드에서 throw e하는 방법 : return 같이 처리
		try {
			s.addItem5("55");			
		} catch (Exception e) {
			System.out.println("메인에서 addItem5에 throw e 처리");
		}
	}
	
}

class Sample {
	
	List <String> list;
	// 예외처리 1번째 방법 -> 메인에서 try,catch하기
	void addItem1(String s) {
		list.add(s);
	}
	
	// 예외처리 2번째 방법 -> 메소드내에서 try, catch하기
	// 예외발생시 if문을 통해 해결해도 됨
	void addItem2(String s) {
		try {
			list.add(s);			
		} catch (Exception e) {
			System.out.println("sample addItem2에서 예외처리");
			
			if(list == null) {
				list = new ArrayList<String>();
				list.add(s);
			}
		}
	}
	
	// 예외처리 3번째 방법 -> throws Exception
	void addItem3(String s) throws Exception {
		list.add(s);
	}
	
	// 예외처리 방법4 -> nullpointer예외 나와도 메인에서 실행은됨. 하지만 try, catch해주는게 정석
	void addItem4(String s) throws NullPointerException {
		list.add(s);
	}
	
	// 예외처리 방법6 -> 메소드에서 throw e하는 방법 : return 같이 처리
	void addItem5(String s) throws Exception {
		
		try {
//			list.add(s); //예외발생
			list.get(10);
		} catch (Exception e) {
			System.out.println("sample addItem5에서 예외처리");
			throw e; // 예외발생시킨다. (직접 예외던지기)
		}
	}
	
	
	
	
	
}
