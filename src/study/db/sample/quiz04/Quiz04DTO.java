package study.db.sample.quiz04;

import java.util.List;

public class Quiz04DTO {
	
	int id;
	String name;
	
	List <Contact> contacts;
	Address address;
	List <Order> orders;
	
	
	public class Contact {
		// getter & setter & 생성자 생략함(만들어야됨)
		String type, value;
	}
	
	
	public class Address {
		// getter & setter & 생성자 생략함(만들어야됨)
		String street, city, zipcode;
	}
	
	
	public class Order {
		// getter & setter & 생성자 생략함(만들어야됨)
		String orderID, name;
		List<Item> items;
	}
	
	
	public class Item {
		// getter & setter & 생성자 생략함(만들어야됨)
		int id, qunatity;
		String name;
	}
	
}
