package study.cls.cls05.pack1;
import study.cls.cls05.pack2.Cup;

public class CupMain {

	public static void main(String[] args) {
		
		// import안했을 경우 동일 클래스명이 있으면 하나를 주소.클래스명으로 새로운 객체 생성해야 알맞은 데이터 나옴
		/*
		Cup c1 = new Cup();
		c1.method();

		study.cls.cls05.pack2.Cup c2 = new study.cls.cls05.pack2.Cup();
		c2.method();
		*/
		
		// import해서 Cup사용시 Cup 2개 다 pack2에있는 Cup으로 출력됨
		// import해서 동일 클래스명 있을 경우 하나를 주소.클래스명으로 새로운 객체 생성해야 해당 데이터 출력됨
		Cup c1 = new Cup();
		c1.method();

		study.cls.cls05.pack1.Cup c2 = new study.cls.cls05.pack1.Cup("유리컵");
		c2.method();
		
		// 접근제한자 (access modifier) -> 접근제한 엄격도 순서 (public < protected < default < private)
		// public -> 외부 클래스가 자유롭게 사용할수있음
		// protected -> 같은 패키지 또는 자식 클래스에서 사용가능 (상속개념)
		// default -> 같은 패키지에 소속된 클래스에서만 사용할수있음
		// private -> 외부에서 사용못함

		Cup cc = new Cup();
//		cc.type = "머그컵"; // type이 default상태여서 접근이안됨
//		cc.type = "머그컵"; // pack2에있는 cup클래스의 type값을 public String type으로 변환하면 사용가능
		cc.method();
		
		study.cls.cls05.pack1.Cup c3 = new study.cls.cls05.pack1.Cup("유리컵");
		c3.method();
//		c3.type = "유리컵"; // c3클래스 Cup과 CupMain이 같은 패키지내에 들어있어서 접근가능 (default)
	}
 
}
