package study.cls.cls04;

public class IPad {

	static String madeBy = "Apple";
	String owner;
	
		
	static void check() {
		System.out.println("아이패드 입니다.");
	}
	
	// public vs static 차이점
	public void powerOn() {
		System.out.println("전원 켜기");
	}
	
}
