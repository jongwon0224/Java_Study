package study.db.sample.quiz04;
import java.io.IOException;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;



public class APIConcept {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		// 외부 공공데이터포탈 api서버 <-> apiService <-> main <-> dao <-> db
		//									<=DTO=>	  <=DTO=>
		
		
		List<CartDTO> cart = new ArrayList<>();
		
		// 데이터 추가
		cart.add(cartDAO("돈까스", "만두"));
		cart.add(cartDAO("치킨", "피자"));
		
		// 출력
		for (CartDTO c : cart) {
			System.out.println(c);
		}
		
	}
	
	
	public static CartDTO cartDAO(String item1, String item2) {
		CartDTO cart = new CartDTO();
		cart.setItem1(item1);
		cart.setItem2(item2);
		return cart;
	}
	
}


class CartDTO { // 포장박스
	String item1, item2;
	
	public String getItem1() {
		return item1;
	}
	
	public void setItem1(String item1) {
		this.item1 = item1;
	}
	
	public String getItem2() {
		return item2;
	}
	
	public void setItem2(String item2) {
		this.item2 = item2;
	}
}

class FoodDAO { // 음식 DB접근 담당 객체
	//findFoodList
	//saveFood
	//modifyFood
	//removeFood
	//findFoodByFoodId
}

class FoodDTO {}
class ClothDAO {}
class ClothDTO {}

class HeadApiService {
	// api서버경로, 요청변수준비, 인증키삽입 & 요청, json포맷텍스트 확보
	// json포맷 -> 정리된 객체 형태 반환
}

