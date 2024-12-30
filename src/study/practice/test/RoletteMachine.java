package study.practice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoletteMachine {
	
	// 필드
	int t_Point = 0, countSuccess = 0, countFail = 0, countLast = 0, income = 0; // 총합포인트, 성공횟수, 실패횟수, 잔여시도횟수, 매출액
	List <Rolette> roletteList; // 룰렛 리스트
	boolean isOpened;
	int countRecharge; //충전 횟수세기
	
	// 생성자
	public RoletteMachine() {
		this.roletteList = new ArrayList<>();
	}
	
	// 룰렛 기기 추가 메소드
	public void addRolette(Rolette name) {
		roletteList.add(name);
	}
	
	// 게임시작 메소드
	public void startRolette() {
		
		int randomNum = (int) (Math.random()*6)+1; // 1에서 6까지 랜덤값 출력
		
		if(countLast == 0) {
			System.out.println("횟수를 충전 해주세요");
			System.out.printf("현재 결과 => 총점: %d, 성공횟수: %d, 실패횟수: %d", t_Point, countSuccess, countFail, countLast);
			return;
		} else if(countLast != 0){
			countLast -= 1;
		
			if(randomNum == 1) {
				countSuccess += 1;
				System.out.println("1점 득점~");
			} else if(randomNum == 2) {
				countSuccess += 2;
				System.out.println("2점 득점~");
			} else if(randomNum == 3) {
				countSuccess += 3;
				System.out.println("3점 득점~");
			} else if(randomNum == 4) {
				countSuccess += 4;
				System.out.println("4점 득점~");
			} else {
				System.out.println("실패~");
				countFail += 1; 
			}
		}
	}
	
	//충전메소드
	public void chargeMoney() {
		
		if(countLast != 0) {
			System.out.println("잔여 횟수가 존재합니다. 사용후 충전하세요.");
			return;
		}
		
		int last = 0; // 잔여횟수
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마를 충전하시겠습니까? (1회 500원 / 1000원부터 충전가능)");
		int inputMoney = scanner.nextInt();
		
		if(inputMoney % 500 != 0 && inputMoney < 1000) { 
			System.out.println("금액을 확인해주세요. (1회 500원 / 1000원부터 충전가능)");
			return;
		} else {
			last = inputMoney / 500; // 잔여횟수 충전금액에 맞춰 추가
			countLast += last; // 최종 잔여횟수 추가
			income += inputMoney; // 매출액 증가
			countRecharge += 1; // 재충전
			System.out.printf("%s회 충전되었습니다. (최종 잔여횟수 : %s)", last, countLast);
		}			
	}
	
	// 마감 메소드
	public void finishSales() {
		
		if(countLast != 0) {
			System.out.println("잔여 횟수가 남아있습니다. 게임을 시작합니다.");
			startRolette();
		} else {		
			System.out.println("오늘 매출액 : " + income + "원 입니다.");
		}
	}
	
	// 기기시작 메소드
	public void startSales() {
		
		isOpened = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============[ 게임 시작 ]==============");
		System.out.print("=====[ 메뉴 선택 ]=====");
		
		while(isOpened) {
			System.out.println();	
			System.out.println("1.충전 2.게임시작 3.마감");
			System.out.println("숫자를 입력해주세요 : ");
			
			int menuNum = 0;
			
			try {
				menuNum = scanner.nextInt();				
			} catch (Exception e) {
				scanner.nextLine();
				menuNum = 0;
			}
			
			if(menuNum == 1) {
				chargeMoney(); //충전메소드
			} else if(menuNum == 2) {
				startRolette(); // 게임시작 메소드
			} else if(menuNum == 3) {
				finishSales(); // 마감 메소드
				System.out.println("==============[ 게임 종료 ]==============");
				isOpened = false;
			}
		}
	}
}
