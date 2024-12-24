package study.inter.inter01;

public interface Temp {

	// 인터페이스 필드
	// 인터페이스 필드는 자동으로 상수가됨
	int CODE = 30; // static final int CODE = 30;
	int TYPE = 50;
	
	
	// 인터페이스 메소드 -> 추상 메소드 : 메소드 선언부분만 작성
	public void method1(); // public abstract void method1()이랑 똑같음
	public void method2();
	
}
