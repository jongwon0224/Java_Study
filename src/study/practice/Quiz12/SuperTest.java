package study.practice.Quiz12;

public class SuperTest {
	
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc o1 = new Orc("오크", 80);		
		System.out.println(o1.toString());
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
//		OrcWarrior or1 = new OrcWarrior("오크전사", 120, 3);
		// 부모클래스에서 자식클래스 생성가능 -> 재정의
		Orc or1 = new OrcWarrior("오크전사", 120, 3);
		System.out.println(or1.toString());
	}	
}


class Orc {
	protected String name;
	protected int hp;
	
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	public String toString() {
//		String str = "Orc { name : " + name + ", hp : " + hp + " } ";
//		return str;
		return String.format("Orc { name : %s, hp : %d }", name, hp);
	}
	

}


class OrcWarrior extends Orc{
	protected int amor;
	
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}
	
	// 메소드 오버라이딩!
	public String toString() {
		return String.format("OrcWarrior { name : %s, hp : %d, armor : %d }", name, hp, amor);
	}
}

