package study.inherit.inherit01;

public class Parent {

	int money;
	
//	public Parent() {
//		
//	}
	
	// 부모 클래스에서 생성자에 매개변수 넣을때
	public Parent(int money) {
		this.money = money;
		System.out.println("parent클래스 생성자");
	}
	
	
	public void setMoney (int money) {
		this.money = money;
	}
	
	public int getMoney() {
		System.out.println(money);
		return money;
	}


	public void say() {
		System.out.println("부모님 말씀");
	}
	
}
