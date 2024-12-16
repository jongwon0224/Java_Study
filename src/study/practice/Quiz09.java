package study.practice;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("출생년도를 입력하세요");
		int birth = scanner.nextInt();
		
		System.out.println("주민번호 뒷자리 첫번째 숫자를 입력하세요");
		int idNum = scanner.nextInt();


		int age = 2024 - birth + 1;

		if(birth < 2000 && idNum == 1) {
			System.out.println(age + "살 남자입니다.");
		} else if(birth < 2000 && idNum == 2) {
			System.out.println(age + "살 여자입니다.");
		} else if(birth >= 2000 && idNum == 3) {
			System.out.println(age + "살 남자입니다.");
		} else if(birth >= 2000 && idNum == 4) {
			System.out.println(age + "살 여자입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}

//		if( (birth < 2000 && (idNum ==1 || idNum ==2) ) ||	(birth >= 2000 && (idNum ==3 || idNum == 4))) {
//				if(idNum == 1 || idNum == 3) {
//					System.out.println("남자");
//				}
//				if(idNum == 2 || idNum == 4) {
//					System.out.println("여자");
//				}
//			} else {
//				System.out.println("잘못입력");
//			}
//		}
		
		
	}

}
