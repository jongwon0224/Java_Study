package study.abst;

public abstract class Beverage {

	String name; //이름
	int ml; //용량
	
	
	public void intro() {
		System.out.println("저는 음료입니다");
	}
	
	public abstract void checkSafety(); //추상 메소드 -> 실체는 없음 그냥 형식만 => 자식클래스에 메소드 재정의해야됨
}
