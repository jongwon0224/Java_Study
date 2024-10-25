package study.practice;

import java.util.Scanner;

public class Prac10byLecturer {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int menu;	//몇번 메뉴 입력
		int count;  //몇개 주문 
		String addOrder; // y/n 
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼", "초코라떼"}; //메뉴이름
		int[] priceArr = {3500, 4100, 4500, 5000}; //메뉴가격
		int[] countArr = new int[menuArr.length];  //메뉴 주문 수량

		
		while (true) {
			
			while(true) {
			
				System.out.println("=========메뉴=========");
				for(int i=0; i<menuArr.length; i++) {	//0~

					System.out.printf("%d.%-8s %6d원\n", i+1, menuArr[i], priceArr[i] );
				}
				System.out.println("=====================");
	
				System.out.print("메뉴 선택 : "); // 1, 2, 3
				menu = scanner.nextInt();
				
				if( menu >= 1 && menu <= menuArr.length ) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 다시 입력하세요");
				}
			}
			
			System.out.print("수량 선택 : ");
			count = scanner.nextInt();  //몇개
			
			countArr[menu-1] += count; //수량 증가시키기
			
			scanner.nextLine();
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine(); // 문자열
				
				if(addOrder.equals("y") || addOrder.equals("n"))
					break;
				else 
					System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
			
			if(addOrder.equals("n")) {

				int total = 0;
				System.out.println("=====================");
				for(int i=0; i<menuArr.length; i++) {
					
					if(countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
						total = total + (countArr[i]*priceArr[i]);
					}
				}
				
				System.out.println("=====================");
				System.out.println("총액 : " + total + "원");
				break;
			}
		}
	}

}