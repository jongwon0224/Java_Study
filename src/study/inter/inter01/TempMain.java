package study.inter.inter01;

import java.util.ArrayList;
import java.util.List;

public class TempMain {

	public static void main(String[] args) {
		
		TempObject t1 = new TempObject();
//		Temp t1 = new Temp(); abstract처럼 인터페이스도 인터페이스 객체는 객체화못함
		
		t1.method1();
		t1.method2();
		
		// 상속 : 부모클래스 타입 = 자식 객체
		// 인터페이스 : 인터페이스 타입 = 구현객체 (해당 인터페이스를 구현한)
		Temp t = new TempObject();
		Temp t2 = new TempObject();
		
		// 배열에 담기
//		Temp[] tArr = new Temp[3];
//		tArr[0] = new TempObject();
		
		// 리스트에 담기
		List <Temp> TempList = new ArrayList <Temp>();
		TempList.add(new TempObject());
		TempList.add(t);
		TempList.add(t2);

		for (Temp item : TempList) {
			System.out.println(item);
		}
	
	}

}
