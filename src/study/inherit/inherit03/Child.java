package study.inherit.inherit03;

public class Child extends Parent {
	private String name;
	
	public Child() {
		// super(); 생략
		this("홍길동");
		System.out.println("Child Call");
	}
	
	public Child(String name) {
		// super(); 생략
		this.name = name;
		System.out.println("Child String name call");
	}
}
