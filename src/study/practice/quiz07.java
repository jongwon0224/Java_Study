package study.practice;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {


	Scanner scanner = new Scanner(System.in);
	
	System.out.println("년도를 입력하세요");
	int year = scanner.nextInt();
	
	
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		System.out.println(year + "년은 윤년입니다.");
	} else {
		System.out.println(year + "년은 윤년이 아닙니다.");
	}
	
//	if(year % 400 == 0) {
//		System.out.println("윤년 O");
//	} else if(year % 100 == 0) {
//		System.out.println("윤년 X");
//	} else if(year % 4 == 0) {
//		System.out.println("윤년 O");
//	} else {
//		System.out.println("윤년 X");
	
	
	
//	if(year % 4 == 0) {
//		
//		if(year % 400 == 0) {
//			System.out.println("윤년 ㅇ");
//		} else {
//			if(year % 100 == 0) {
//			System.out.println("윤년 x");
//			} else {
//				System.out.println("윤년O");
//			}
//		}
//	} else {
//		System.out.println("윤년 x");
//	}
	
	
//	if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//		System.out.println("윤년 O");
//	} else {
//		System.out.println("운년 X");
//	}
	
	
	
	
	
	
	}

}
