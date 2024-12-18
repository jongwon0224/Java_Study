package study.practice.prac18.list;
import java.util.ArrayList;

public class Order2 {

	// 필드(인스턴스 필드)
	int orderNum;
	ArrayList<Menu2> menus;
	
	// 생성자
	public Order2(int i, ArrayList<Menu2> list) {
		orderNum = i;
		menus = list;
	}
	
	
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		int sum = 0;
		
		for(int i=0; i<menus.size(); i++) {
			sum += menus.get(i).price;
		}
		
		return sum;
	}
}
