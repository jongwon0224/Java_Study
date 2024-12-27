package study.practice.prac26;

import java.util.ArrayList;
import java.util.List;

public class InterfaceType {
	
	public static void main(String[] args) {
		// 객체 생성
		Food f1 = new Food("족발", 19800);
		Electronics e1 = new Electronics("에어팟", 199000);
		Clothing c1 = new Clothing("셔츠", 49900);
		// 총합 계산
		List <Orderable> list = new ArrayList <>();
		list.add(f1);
		list.add(e1);
		list.add(c1);
		
		int total = 0;

		for(Orderable item : list) {
			total += item.discountedPrice();
		}
		// 결과 출력
		System.out.println("총합: " + total + "원");
	}
}


interface Orderable {
	
	public int discountedPrice();
}


class Food implements Orderable {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int discountedPrice() {
		double discount = 0.1;
		return (int) (price * (1 - discount));
	}
}


class Electronics implements Orderable {
	
	private String name;
	private int price;
	
	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int discountedPrice() {
		double discount = 0.2;
		return (int) (price * (1 - discount));
	}
}

class Clothing implements Orderable {
	
	private String name;
	private int price;
	
	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public int discountedPrice() {
		double discount = 0.3;
		return (int) (price * (1 - discount));
	}
}

