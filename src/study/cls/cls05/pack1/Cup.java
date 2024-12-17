package study.cls.cls05.pack1;

public class Cup {

	private String type; //접근제한자 : default
	// private String type; private 설정시 같은 패키지여도 사용불가
	static final double PI = 3.141592; // 정적 final 필드 -> const같은 개념(대문자사용)
		
	private Cup() {
//		private생성자는 main클래스에서 객체생성 못함
	}
	
	public Cup(String type) {
		this.type = type; // 생성자를 통해서 private필드변수에 public으로 접근가능
	}
	
	public void method() {
		System.out.println("pack1.Cup method()" + type);
	}
	
	// 클래스에도 접근제한자 가능
	class A {
	// default상태
	}
	
	class B {
	// default상태
	}
	
}
