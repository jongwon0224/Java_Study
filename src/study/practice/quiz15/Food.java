package study.practice.quiz15;

public class Food {
	
	String name; // 음식이름
	int price, stock; // 가격, 재고
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	- 각 음식별 재고를 설정할 수 있다.
	public void setStock(int stock) {
		this.stock = stock;
	}
	

	

}
