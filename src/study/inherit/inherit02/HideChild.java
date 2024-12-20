package study.inherit.inherit02;

import study.inherit.inherit01.Parent;


public class HideChild extends Parent {
	

	// 다른 패키지내 상속할경우 -> 부모 필드값에 protected 사용
	
	public HideChild (int money) {
		super(money);
	}
	
	public void PrintInfo() {
		System.out.println(money);
	}
	
}
