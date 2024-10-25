package study.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		String [][] menuArr = { 
				{"1. 아메리카노","2. 카페라떼 ","3. 바닐라라떼"},
				{"3500","4100","4300"} }; 
		

		while(true) {
		
			System.out.println("==========메뉴==========");
			for(int i=0; i<1; i++) {
				for(int j=0; j<3; j++) {
					System.out.println(menuArr[0][j] + "      " + menuArr[1][j]+"원");
				}
			}
			
			System.out.println("=======================");
			System.out.println("메뉴 선택 : ");
			int menu = scanner.nextInt();
			
			System.out.println("수량 선택 : ");
			int num = scanner.nextInt();
			
			System.out.println("추가 주문하시겠습니까?(Y/N) : ");
			String order = scanner.next();
			
			
			int sum = 0;
			
			if(menu >= 1 && menu < 4) {
				String value = menuArr[1][menu-1];
				sum = Integer.parseInt(value);
				
				if(num != 0) {
					sum += num * sum;
					
					if(order.equals("N")) {
						sum += sum;
						System.out.println(menuArr[0][menu-1]+ " " + num + "잔" + " : " + sum + "원");
						System.out.println("총액 : " + sum + "원");
						break;
						
						
					} else if(order.equals("Y")) {
						sum += sum;
						
					} else {
						System.out.println("다시 입력해주세요");
					}
				}	
			}
		}
		*/
					
		/*
		Scanner scanner = new Scanner(System.in);
		int menu;
		int count;
		String addOrder;
		
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		while(true) {
			
			System.out.println("============메뉴==========");
			System.out.println("1. 아메리카노          3500원");
			System.out.println("2. 카페라떼           4100원");
			System.out.println("3. 바닐라라떼          4300원");
			System.out.println("=========================");
			
			
		
			
			System.out.println("메뉴 선택 : ");
			
			menu = scanner.nextInt();
			if(menu >= 1 && menu <= 3) { // 정상 선택
				
				System.out.println("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1) {
					menu1Count += count;
				}
				if(menu == 2) {
					menu2Count += count;
				}
				if(menu == 3) {			
					menu2Count += count;
				}
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
				
				
				scanner.nextLine(); // 입력값 청소
				System.out.println("추가 주문하시겠습니까?(y/n) :  ");
				addOrder = scanner.nextLine(); //문자열
				
				// 잘못된 입력, 정상입력
				if(addOrder.equals("n")) {
					//입력받는 반복문 끝.
					// 주문한 메뉴 보여주고
					// 총 금액 보여주고 -> 끝.
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
					int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("총액 : " + total + "원");
					break;
				}
				
			} else { //메뉴 보여주고, 메뉴입력 다시 받기
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
			*/
			
		
		
		
		Scanner scanner = new Scanner(System.in);
		int menu; // 몇번 메뉴 입력
		int count; // 몇개 주문
		String addOrder; // y/n
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"}; //메뉴이름
		int[] priceArr = {3500, 4100, 4300}; //메뉴가격
		int[] countArr = new int [menuArr.length]; // 주문 수량
		System.out.println(Arrays.toString(countArr));
		
		
		while(true) {
			
			while(true) {
				
				System.out.println("============메뉴==========");
				for(int i=0; i<menuArr.length; i++) { // 0,1,2
					System.out.printf("%d.%-8s %6d원\n", i+1, menuArr[i], priceArr[i]);
				}
				System.out.println("=========================");
				
				System.out.println("메뉴 선택 : ");
				menu = scanner.nextInt();
				
				if(menu>=1 && menu <= menuArr.length) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 다시 입력하세요.");
				}
			}
			
			System.out.print("수량 선택 : ");
			count = scanner.nextInt(); // 몇개
			
			countArr[menu-1] += count; // 수량 증가 시키기
//			countArr[0] = countArr[0] + 2; => [2,0,0]
//			countArr[1] = countArr[1] + 2; => [2,2,0]
//			countArr[2] = countArr[2] + 2; => [2,2,2]
//			countArr[0] = countArr[0] + 5; => [7,2,2]
			System.out.println(Arrays.toString(countArr));
			
			scanner.nextLine();
			//추가주문 여부
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine();
				
				if(addOrder.equals("y") || addOrder.equals("n")) {					
					break;
				} else {
					System.out.println("잘못입력했습니다. 다시 입력하세요");
				}
			}

			if(addOrder.equals("n")) {
				
				int total = 0;
				System.out.println("=========================");
				for(int i=0; i<menuArr.length; i++) { // 0,1,2
//					countArr = [7,2,2]
//					7>0, 2>0, 2>0					
					if(countArr[i] > 0) { 
						System.out.printf("%s %d잔 : %d원\n",
								menuArr[i], countArr[i], countArr[i]*priceArr[i]);		
						//menuArr: 1번 countArr:7잔, 7*1번가격 얼마
						//menuArr: 2번 countArr:2잔, 2*2번가격 얼마
						//menuArr: 3번 countArr:2잔, 2*3번가격 얼마
						total += countArr[i]*priceArr[i];
					}
				}
				System.out.println("=========================");
				System.out.println("총액 : " + total + "원");
				break;
			}
		}
			
			
			
			
			
			
			/*
			if(menu >= 1 && menu <= 3) { // 정상 선택
				
				System.out.println("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1) {
					menu1Count += count;
				}
				if(menu == 2) {
					menu2Count += count;
				}
				if(menu == 3) {			
					menu2Count += count;
				}
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
				
			scanner.nextLine(); // 입력값 청소
			System.out.println("추가 주문하시겠습니까?(y/n) :  ");
			addOrder = scanner.nextLine(); //문자열
			
			// 잘못된 입력, 정상입력
			if(addOrder.equals("n")) {
				//입력받는 반복문 끝.
				// 주문한 메뉴 보여주고
				// 총 금액 보여주고 -> 끝.
				System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
				System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
				System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
				int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
				System.out.println("총액 : " + total + "원");
				break;
			} else { //메뉴 보여주고, 메뉴입력 다시 받기
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}\*/
		//} 
	
				
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
