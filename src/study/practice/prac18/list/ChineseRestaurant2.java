package study.practice.prac18.list;
import java.util.ArrayList;

public class ChineseRestaurant2 {
	
	public static void main(String[] args) {
		
		// 주문을 위한 메뉴 선정
		Menu2 jjajang = new Menu2("짜장", 4900);
		Menu2 jjambbong = new Menu2("짬뽕", 5900);
		Menu2 tangsook = new Menu2("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
		
		ArrayList<Menu2> list = new ArrayList<Menu2>();
		list.add(jjajang);
		list.add(jjambbong);
		list.add(tangsook);
		
		Order2 order = new Order2(123, list);
		
		
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}
