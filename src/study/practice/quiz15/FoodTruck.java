
package study.practice.quiz15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	List <Food> foodList;
	
	int sales = 0; //매출
	int minusTotal; // 폐기손해 총액
	boolean isOpened;
	
	public FoodTruck () {
		this.foodList = new ArrayList<>();
	}
	
	// 푸드 리스트 추가 메소드
	public void addFood(Food name) {
		foodList.add(name);
	}
	
	/* 수정필요
	// 메뉴에 음식 추가
	public void inputMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴명을 설정해주세요.");
		String name = scanner.nextLine();
		System.out.println("가격을 설정해주세요.");
		int newPrice = scanner.nextInt();
		System.out.println("재고를 설정해주세요");
		int newStock = scanner.nextInt();
		
		for(Food item : foodList) {
			if(item.name.contains(name)) {
				System.out.println("동일 메뉴가 있습니다. 다시 입력해주세요.");
				return;
			}
		}
		
		Food newFood = new Food(name, newPrice);
		newFood.setStock(newStock);
		addFood(newFood);
		System.out.printf("메뉴 %s이(가) 추가되었습니다.", name);
	}
	*/
	
//	- 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이 있다.
	public void getFoodInfo () {
		
		for(Food item : foodList) {
			System.out.printf("이름: %s, 가격: %d, 재고: %d", item.name, item.price, item.stock);
			System.out.println();
		}		
	}
//	- 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다.
//	- 재고가 없는 메뉴는 판매할 수 없다.
	public void orderMenu() {
		
		getFoodInfo();
		
		try {		
			Scanner scanner = new Scanner(System.in);
			System.out.print("어떤 메뉴를 주문하시겠습니까?");
			String orderList = scanner.next();
			System.out.print("몇개를 주문하시겠습니까?");
			int orderFood = scanner.nextInt(); //주문하는 메뉴 총계
			System.out.println();
			
			for(Food item : foodList) {
				
				if(orderList.equals(item.name)) {
					
					if(item.stock == 0) {
						System.out.printf("%s의 재고가 없습니다.", item.name);
						return;
					} else {
						sales += item.price * orderFood;
						item.stock -= orderFood;
						System.out.printf("메뉴:%s 수량:%d개 금액:%s", item.name, orderFood, item.price * orderFood);
						System.out.println();
					}
				} else {
					System.out.println("메뉴이름을 다시 확인해주세요.");
				}
				return;
			}
		} catch(Exception e) {
			System.out.println("형식에 맞게 입력해주세요.");
		}
	}
	
	
// 재고관리(메뉴 재고 추가)
	public void addStock() {
		
		Scanner scanner = new Scanner(System.in);
					
		try {
			System.out.print("재고를 추가할 메뉴를 입력하세요.");
			String fdName = scanner.next();
			System.out.println();				
			
			for(Food item : foodList) {
				
				if(item.name.equals(fdName)) {
					System.out.println("추가할 재고 개수를 입력하세요.");
					int stockPlus = scanner.nextInt();
					item.stock += stockPlus;
					System.out.printf("%s의 재고가 %d개 추가되었습니다. 현재 재고:%d개", item.name, stockPlus, item.stock);
					
				} else {
					System.out.println("잘못된 입력입니다. 다시 확인해주세요.");
				}
				return;
			}
			
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다. 다시 시도해주세요");
		}		
	}
	
// 마감하기
	public void closeSales() {
		
		double minusSales = 0.3; //30%디스카운트
		int totalMinus = 0; // 폐기 총 손해
		
		for (Food item : foodList) {
			
			if(item.stock > 0) {
				totalMinus += item.stock * item.price * minusSales;
			}
		}
		System.out.printf("매출(%d원) - 폐기손해(%d) = 최종수익(%d원)", sales, totalMinus, sales-totalMinus);
	}
	
	public void startSales() {
		
		isOpened = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============[ 푸드트럭 영업 시작 ]==============");
		System.out.print("=====[ 메뉴 선택 ]=====");
		
		while(isOpened) {
			System.out.println();	
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기 5.메뉴추가");
			System.out.println("숫자를 입력해주세요 : ");
			System.out.println("=========현재 재고=========");
			
			int menuNum = 0;
			
			try {
				menuNum = scanner.nextInt();				
			} catch (Exception e) {
				scanner.nextLine();
				menuNum = 0;
			}
			
			if(menuNum == 1) {
				getFoodInfo();
			} else if(menuNum == 2) {
				orderMenu();
			} else if(menuNum == 3) {
				addStock();
			} else if(menuNum == 4) {
				closeSales();
				isOpened = false;
				System.out.println();
				System.out.println("==============[ 푸드트럭 영업 마감 ]==============");
			} else if(menuNum == 5) {
				//inputMenu();
			}
		}
		
	}
}

