package study.cls.cls06;

public class Singleton {

//	싱글톤 작성 방법
//	1. 클래스 외부에서 new 연산자 통해 생성자 호출하는 것 불가하도록 private접근 제한자 사용
//	2. 자신의 타입인 정적 필드 선언 후 자신의 객체 생성해 초기화
//	3. 외부에서 호출할수있는 getInstance()선언
//	4. 정적 필드에서 참조하는 자신의 객체 리턴
	
	/*
	// 정적 필드
	private static 클래스 singleton = new 클래스 ();
	
	// 생성자
	private 클래스() {}
	
	// 정적 메소드
	static 클래스 getInstance() {
		return singleton;
	}
	*/

	private static Singleton singleton = new Singleton();
	
	private Singleton () {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
