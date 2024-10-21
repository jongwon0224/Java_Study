package study.condition;

import java.util.Scanner;

public class condition02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int dice = 5;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		} 
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		if(dice == 1) {
			
		} else if(dice = 2) {
		} else if(dice == 3) {
		} else {
		}
		
		*/
		
		/*
		//switch 문
//			
//		Scanner scanner = new Scanner(System.in);
//		
//		int dice1 = scanner.nextInt();
//		System.out.println("=========switch=============");
//		dice = 3;
//		
//		switch(dice1) {
//		case 1: //case에는 값만 입력 가능 => 인자랑 값이 같은지 확인
//			System.out.println("case" + dice1);
//			break;
//		case 2:
//			System.out.println("case" + dice1);
//			break;
//		case 3:
//			System.out.println("case" + dice1);
//			break;
//		case 4:
//			System.out.println("case" + dice1);
//			break;
//		case 5:
//			System.out.println("case" + dice1);
//			break;
//		case 6:
//			System.out.println("case" + dice1);
//			break;
//		default: // else역할 => 위에있는 값이랑 맞지 않으면 실행됨
//			System.out.println("default");
//		}
		

		int showTime = 8;
		
//		if(showTime <= 8) {
//		} else if(showTime <= 9) {
//			
//		} else if(showTime <=10) {
//			
//		} else if(showTime <= 11) {
//			
//		}
		
		
		System.out.println("=========switch=============");
		
		//모든 조건에 break시 이렇게 조건을 다 적어야됨 => break를 한군데에만 쓰면 그전에 조건 다 상속됨
		switch(showTime) { 
		case 8:
			System.out.println("청소");
//			System.out.println("회의");
//			System.out.println("업무");
//			System.out.println("외근");
//			break;
		case 9:
			System.out.println("회의");
//			System.out.println("업무");
//			System.out.println("외근");
//			break;
		case 10:
			System.out.println("업무");
//			System.out.println("외근");
//			break;
		case 11:
			System.out.println("외근");
			break;
		}
			
		int goBedTime = 21;
		int sleepTime = 9;
		
		if(goBedTime <= 21) {
			//일찍잤구나
			if(sleepTime >= 9) {
				//많이잤구나
			} else {
				//조금잤구나
			}
			
		} else {
			//좀 늦게 잤구나
		} if(sleepTime >= 9) {
			// 많이 잤구나
		} else {
			//조금 잤구나
		}
			
		
		if(goBedTime <= 21 && sleepTime >= 9) {
			//일찍 //많이 
		} else if(goBedTime <= 21 && !(sleepTime >= 9)) {
//		} else if(goBedTime <= 21 && sleepTime < 9) {
			//일찍 //조금
		} else if(goBedTime > 21 && sleepTime >= 9) {
			//늦게 //많이
		} else {
			//늦게 //조금
		}
		
		*/
		


		
		
	}
	
}
