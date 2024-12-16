package study.cls.cls04;

public class IPadMain {

	public static void main(String[] args) {
		
		IPad p1 = new IPad(); //인스턴스 객체 생성
		
		p1.owner = "내꺼";
		p1.powerOn();
		
		IPad p2 = new IPad();
		p2.owner = "니꺼";

		System.out.println(p1.owner);
		System.out.println(p2.owner);
		
		// static변수,메소드 사용시 클래스명으로 사용가능
		System.out.println(IPad.madeBy);
		IPad.check();
	}

}
