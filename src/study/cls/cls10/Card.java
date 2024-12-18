package study.cls.cls10;

public class Card { // 출결카드

	int id; // 아이디
	String source, type, owner; //발급처, 타입, 주인

	
	public Card(int id, String source, String type, String owner) {
		this.id = id;
		this.source = source;
		this.type = type;
		this.owner = owner;
	}
	
	
}
