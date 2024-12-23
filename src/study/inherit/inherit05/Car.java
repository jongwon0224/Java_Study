package study.inherit.inherit05;

import java.util.ArrayList;
import java.util.List;

public class Car {
	//필드
	// 타이어는 상수형 변수로 사용
	public static final int FRONT_LEFT_TIRE = 0;
	public static final int FRONT_RIGHT_TIRE = 1;
	public static final int BACK_LEFT_TIRE = 2;
	public static final int BACK_RIGHT_TIRE = 3;
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6); 
	Tire frontRightTire = new Tire("앞오른쪽", 2); 
	Tire backLeftTire = new Tire("뒤왼쪽", 3);  
	Tire backRightTire =new Tire("뒤오른쪽", 4);
	
	Tire [] tireArr; // 배열로 변수 관리하기
	List <Tire> tireList; // 리스트로 변수 관리하기
	
	
	public Car (Tire frontLeftTire, Tire frontRightTire, Tire backLeftTire, Tire backRightTire) {
		
		tireArr = new Tire[4]; //배열 초기화
		tireList = new ArrayList<Tire>(); //리스트 초기화
		
		// 상수형 변수 사용시 인덱스값 말고 상수형변수명 사용
		tireArr[FRONT_LEFT_TIRE] = frontLeftTire; // 배열에 요소 넣기
		tireArr[FRONT_RIGHT_TIRE] = frontRightTire; // 배열에 요소 넣기
		tireArr[BACK_LEFT_TIRE] = backLeftTire; // 배열에 요소 넣기
		tireArr[BACK_RIGHT_TIRE] = backRightTire; // 배열에 요소 넣기
		
		tireList.add(frontLeftTire); // 리스트에 요소 넣기
		tireList.add(frontRightTire); // 리스트에 요소 넣기
		tireList.add(backLeftTire); // 리스트에 요소 넣기
		tireList.add(backRightTire); // 리스트에 요소 넣기
		
		this.frontLeftTire = frontLeftTire;
		this.frontRightTire = frontRightTire;
		this.backLeftTire = backLeftTire;
		this.backRightTire = backRightTire;
	}
	

	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
//		if(frontLeftTire.roll()==false) { stop(); return 1; }
//		if(frontRightTire.roll()==false) { stop(); return 2; }
//		if(backLeftTire.roll()==false) { stop(); return 3; }
//		if(backRightTire.roll()==false) { stop(); return 4; }
		
		/* 배열 사용시 if문 수정
		if(tireArr[0].roll() == false) {stop(); return 1;}
		if(tireArr[1].roll() == false) {stop(); return 2;}
		if(tireArr[2].roll() == false) {stop(); return 3;}
		if(tireArr[3].roll() == false) {stop(); return 4;}
		*/
		if(tireArr[0].roll() == false) {stop(); return FRONT_LEFT_TIRE;} //0
		if(tireArr[1].roll() == false) {stop(); return FRONT_RIGHT_TIRE;} //1
		if(tireArr[2].roll() == false) {stop(); return BACK_LEFT_TIRE;} //2
		if(tireArr[3].roll() == false) {stop(); return BACK_RIGHT_TIRE;} //3
		
		/*
		// 리스트 사용시 if문 바뀜 (get함수를 통해 요소값 출력)
		if(tireList.get(0).roll() == false) {stop(); return 1;}
		if(tireList.get(1).roll() == false) {stop(); return 2;}
		if(tireList.get(2).roll() == false) {stop(); return 3;}
		if(tireList.get(3).roll() == false) {stop(); return 4;}
		*/
		
		return 10; // 정상일 경우 숫자 10 반환
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

